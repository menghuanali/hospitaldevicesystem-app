package com.pch.demo.ui.fragment;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hjq.http.EasyHttp;
import com.hjq.http.listener.HttpCallback;
import com.pch.base.BaseAdapter;
import com.pch.demo.R;
import com.pch.demo.common.MyActivity;
import com.pch.demo.common.MyFragment;
import com.pch.demo.http.model.PchHttpData;
import com.pch.demo.http.request.NoticeApi;
import com.pch.demo.ui.adapter.DataNoticeAdapter;
import com.pch.widget.layout.WrapRecyclerView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.util.ArrayList;
import java.util.List;

/**
 *    author : 潘成花
 *    time   : 2021/02/10
 *    desc   : 申请的列表加载
 */
public final class DataNoticeFragment extends MyFragment<MyActivity>
        implements OnRefreshLoadMoreListener,
        BaseAdapter.OnItemClickListener {

    public static DataNoticeFragment newInstance() {
        return new DataNoticeFragment();
    }

    private SmartRefreshLayout mRefreshLayout;
    private WrapRecyclerView mRecyclerView;

    private DataNoticeAdapter mAdapter;
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    protected int getLayoutId() {
        return R.layout.data_notice_fragment;
    }

    @Override
    protected void initView() {
        mRefreshLayout = findViewById(R.id.rl_status_refresh);
        mRecyclerView = findViewById(R.id.rv_status_list);

        mAdapter = new DataNoticeAdapter(getAttachActivity());
        mAdapter.setOnItemClickListener(this);
        mRecyclerView.setAdapter(mAdapter);

        TextView headerView = mRecyclerView.addHeaderView(R.layout.picker_item);
        headerView.setText("公告列表");
        TextView footerView = mRecyclerView.addFooterView(R.layout.picker_item);

        mRefreshLayout.setOnRefreshLoadMoreListener(this);
    }

    @Override
    protected void initData() {
        mAdapter.setData(analogData());
    }

    /**
     * 从服务器加载数据
     */
    private List<String> analogData() {
        List<String> resultData = new ArrayList<>();
//        这里是异步
        EasyHttp.post(this)
                .api(new NoticeApi())
                .request(new HttpCallback<PchHttpData>(this){
                    @Override
                    public void onSucceed(PchHttpData data) {
                        System.out.println("得到的对象List");
                        System.out.println(gson.toJson(data.getList()));
                        if(data.getList().size()>mAdapter.getItemCount()){
                            System.out.println(data.getList().size()+"   "+mAdapter.getItemCount());
                            int addsize = data.getList().size()-mAdapter.getItemCount()>10?mAdapter.getItemCount()+10:data.getList().size();
                            for (int i = mAdapter.getItemCount(); i < addsize; i++) {
                                resultData.add(data.getList().get(i).getTitle());
                            }
                        }else {
                            toast("没有了哦");
                        }
                    }
                });
        return resultData;
    }

    /**
     * {@link BaseAdapter.OnItemClickListener}
     *
     * @param recyclerView      RecyclerView对象
     * @param itemView          被点击的条目对象
     * @param position          被点击的条目位置
     */
    @Override
    public void onItemClick(RecyclerView recyclerView, View itemView, int position) {
        toast(mAdapter.getItem(position));
    }

    /**
     * {@link OnRefreshLoadMoreListener}
     */

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        postDelayed(() -> {
            mAdapter.clearData();
            System.out.println("刷新后的数量"+mAdapter.getItemCount());
            mAdapter.setData(analogData());
            mRefreshLayout.finishRefresh();
            toast("刷新完成");
        }, 1000);
    }

    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
        postDelayed(() -> {
            mAdapter.addData(analogData());
            mRefreshLayout.finishLoadMore();
            toast("加载完成");
        }, 1000);
    }
}
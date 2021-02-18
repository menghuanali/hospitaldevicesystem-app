package com.pch.demo.ui.fragment;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pch.base.BaseAdapter;
import com.pch.demo.R;
import com.pch.demo.common.MyActivity;
import com.pch.demo.common.MyFragment;
import com.pch.demo.ui.adapter.DataApplyAdapter;
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
public final class DataApplyFragment extends MyFragment<MyActivity>
        implements OnRefreshLoadMoreListener,
        BaseAdapter.OnItemClickListener {

    public static DataApplyFragment newInstance() {
        return new DataApplyFragment();
    }

    private SmartRefreshLayout mRefreshLayout;
    private WrapRecyclerView mRecyclerView;

    private DataApplyAdapter mAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.data_apply_fragment;
    }

    @Override
    protected void initView() {
        mRefreshLayout = findViewById(R.id.rl_status_refresh);
        mRecyclerView = findViewById(R.id.rv_status_list);

        mAdapter = new DataApplyAdapter(getAttachActivity());
        mAdapter.setOnItemClickListener(this);
        mRecyclerView.setAdapter(mAdapter);

        TextView headerView = mRecyclerView.addHeaderView(R.layout.picker_item);
        headerView.setText("申请列表");
        TextView footerView = mRecyclerView.addFooterView(R.layout.picker_item);
        footerView.setText("加载更多");
        footerView.setOnClickListener(v -> toast("正在加载更多···"));

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
        List<String> data = new ArrayList<>();
        for (int i = mAdapter.getItemCount(); i < mAdapter.getItemCount() + 20; i++) {
            data.add("我是第" + i + "条目");
        }
        return data;
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
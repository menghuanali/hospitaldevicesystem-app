package com.pch.demo.ui.activity;

import androidx.core.content.ContextCompat;

import com.pch.demo.R;
import com.pch.demo.action.StatusAction;
import com.pch.demo.common.MyActivity;
import com.pch.demo.ui.dialog.MenuDialog;
import com.pch.demo.widget.HintLayout;

/**
 *    author : 潘成花
 *    
 *    time   : 2020/04/17
 *    desc   : 加载使用案例
 */
public final class StatusActivity extends MyActivity
        implements StatusAction {

    private HintLayout mHintLayout;

    @Override
    protected int getLayoutId() {
        return R.layout.status_activity;
    }

    @Override
    protected void initView() {
        mHintLayout = findViewById(R.id.hl_status_hint);
    }

    @Override
    protected void initData() {
        new MenuDialog.Builder(this)
                //.setAutoDismiss(false) // 设置点击按钮后不关闭对话框
                .setList("加载中", "请求错误", "空数据提示", "自定义提示")
                .setListener((dialog, position, object) -> {
                    switch (position) {
                        case 0:
                            showLoading();
                            postDelayed(this::showComplete, 2500);
                            break;
                        case 1:
                            showError(v -> {
                                showLoading();
                                postDelayed(this::showEmpty, 2500);
                            });
                            break;
                        case 2:
                            showEmpty();
                            break;
                        case 3:
                            showLayout(ContextCompat.getDrawable(getActivity(), R.drawable.hint_order_ic), "暂无订单", null);
                            break;
                        default:
                            break;
                    }
                })
                .show();
    }

    @Override
    public HintLayout getHintLayout() {
        return mHintLayout;
    }
}
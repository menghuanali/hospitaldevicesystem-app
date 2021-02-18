package com.pch.demo.ui.fragment;

import com.pch.demo.R;
import com.pch.demo.common.MyFragment;
import com.pch.demo.ui.activity.CopyActivity;

/**
 *    author : 潘成花
 *    time   : 2021/02/18
 *    desc   : 我接受得订单中心 维修人员的 查看当前正在处理的订单信息；
 */
public final class PchOrderFragment extends MyFragment<CopyActivity> {

    public static PchOrderFragment newInstance() {
        return new PchOrderFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.copy_fragment;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}
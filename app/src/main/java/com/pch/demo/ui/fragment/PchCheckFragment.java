package com.pch.demo.ui.fragment;

import com.pch.demo.R;
import com.pch.demo.common.MyFragment;
import com.pch.demo.ui.activity.CopyActivity;

/**
 *    author : 潘成花
 *    time   : 2021/02/18
 *    desc   : 登记当前设备维修情况，并修改订单状态；
 */
public final class PchCheckFragment extends MyFragment<CopyActivity> {

    public static PchCheckFragment newInstance() {
        return new PchCheckFragment();
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
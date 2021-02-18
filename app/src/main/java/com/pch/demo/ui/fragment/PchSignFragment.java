package com.pch.demo.ui.fragment;

import com.pch.demo.R;
import com.pch.demo.common.MyFragment;
import com.pch.demo.ui.activity.CopyActivity;

/**
 *    author : 潘成花
 *    time   : 2021/02/18
 *    desc   : 维修人员签收界面 对下派给自己的订单进行签收
 */
public final class PchSignFragment extends MyFragment<CopyActivity> {

    public static PchSignFragment newInstance() {
        return new PchSignFragment();
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
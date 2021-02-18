package com.pch.demo.ui.fragment;

import com.pch.demo.R;
import com.pch.demo.common.MyFragment;
import com.pch.demo.ui.activity.CopyActivity;

/**
 *    author : 潘成花
 *    time   : 2021/02/18
 *    desc   : 医生的评价界面
 */
public final class PchAppraiseFragment extends MyFragment<CopyActivity> {

    public static PchAppraiseFragment newInstance() {
        return new PchAppraiseFragment();
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
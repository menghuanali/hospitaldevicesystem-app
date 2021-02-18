package com.pch.demo.ui.fragment;

import com.pch.demo.R;
import com.pch.demo.common.MyFragment;
import com.pch.demo.ui.activity.CopyActivity;

/**
 *    author : 潘成花
 *    time   : 2021/02/18
 *    desc   : 医生得故障申报
 */
public final class PchApplyFragment extends MyFragment<CopyActivity> {

    public static PchApplyFragment newInstance() {
        return new PchApplyFragment();
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
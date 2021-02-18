package com.pch.demo.ui.fragment;

import android.annotation.SuppressLint;

import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.pch.base.BaseFragmentAdapter;
import com.pch.demo.R;
import com.pch.demo.common.MyFragment;
import com.pch.demo.ui.activity.CopyActivity;
import com.pch.demo.widget.XCollapsingToolbarLayout;

/**
 *    author : 潘成花
 *    time   : 2021/02/18
 *    desc   : 设备系统得主页包含公告，现在没有接单得所有订单 可以按照医院分类查看
 */
public final class PchHomeFragment extends MyFragment<CopyActivity>
        implements XCollapsingToolbarLayout.OnScrimsListener{
    private XCollapsingToolbarLayout mCollapsingToolbarLayout;

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    private BaseFragmentAdapter<MyFragment> mPagerAdapter;
    public static PchHomeFragment newInstance() {
        return new PchHomeFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.pch_home_fragment;
    }

    @Override
    protected void initView() {
        mCollapsingToolbarLayout = findViewById(R.id.ctl_home_bar);

        mTabLayout = findViewById(R.id.tl_home_tab);
        mViewPager = findViewById(R.id.vp_home_pager);

        mPagerAdapter = new BaseFragmentAdapter<>(this);
        mPagerAdapter.addFragment(DataNoticeFragment.newInstance(), "公告");
        mPagerAdapter.addFragment(DataApplyFragment.newInstance(), "医院 A");
        mPagerAdapter.addFragment(DataApplyFragment.newInstance(), "医院 C");
        mViewPager.setAdapter(mPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

        //设置渐变监听
        mCollapsingToolbarLayout.setOnScrimsListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public boolean statusBarDarkFont() {
        return mCollapsingToolbarLayout.isScrimsShown();
    }
    /**
     * CollapsingToolbarLayout 渐变回调
     *
     * {@link XCollapsingToolbarLayout.OnScrimsListener}
     */
    @SuppressLint("RestrictedApi")
    @Override
    public void onScrimsStateChange(XCollapsingToolbarLayout layout, boolean shown) {
        if (shown) {
            getStatusBarConfig().statusBarDarkFont(true).init();
        } else {
            getStatusBarConfig().statusBarDarkFont(false).init();
        }
    }
}
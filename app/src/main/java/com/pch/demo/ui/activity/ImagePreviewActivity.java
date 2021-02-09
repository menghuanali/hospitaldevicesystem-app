package com.pch.demo.ui.activity;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;

import com.gyf.immersionbar.BarHide;
import com.gyf.immersionbar.ImmersionBar;
import com.pch.demo.R;
import com.pch.demo.aop.CheckNet;
import com.pch.demo.aop.DebugLog;
import com.pch.demo.common.MyActivity;
import com.pch.demo.other.IntentKey;
import com.pch.demo.ui.pager.ImagePagerAdapter;
import com.rd.PageIndicatorView;

import java.util.ArrayList;

/**
 *    author : 潘成花
 *    
 *    time   : 2020/03/05
 *    desc   : 查看大图
 */
public final class ImagePreviewActivity extends MyActivity {

    public static void start(Context context, String url) {
        ArrayList<String> images = new ArrayList<>(1);
        images.add(url);
        start(context, images);
    }

    public static void start(Context context, ArrayList<String> urls) {
        start(context, urls, 0);
    }

    @CheckNet
    @DebugLog
    public static void start(Context context, ArrayList<String> urls, int index) {
        Intent intent = new Intent(context, ImagePreviewActivity.class);
        intent.putExtra(IntentKey.IMAGE, urls);
        intent.putExtra(IntentKey.INDEX, index);
        context.startActivity(intent);
    }

    private ViewPager mViewPager;
    private PageIndicatorView mIndicatorView;

    @Override
    protected int getLayoutId() {
        return R.layout.image_preview_activity;
    }

    @Override
    protected void initView() {
        mViewPager = findViewById(R.id.vp_image_preview_pager);
        mIndicatorView = findViewById(R.id.pv_image_preview_indicator);
        mIndicatorView.setViewPager(mViewPager);
    }

    @Override
    protected void initData() {
        ArrayList<String> images = getStringArrayList(IntentKey.IMAGE);
        int index = getInt(IntentKey.INDEX);
        if (images != null && images.size() > 0) {
            mViewPager.setAdapter(new ImagePagerAdapter(this, images));
            if (index != 0 && index <= images.size()) {
                mViewPager.setCurrentItem(index);
            }
        } else {
            finish();
        }
    }

    @NonNull
    @Override
    protected ImmersionBar createStatusBarConfig() {
        return super.createStatusBarConfig()
                // 隐藏状态栏和导航栏
                .hideBar(BarHide.FLAG_HIDE_BAR);
    }

    @Override
    public boolean isStatusBarDarkFont() {
        return false;
    }

    @Override
    public boolean isSwipeEnable() {
        return false;
    }
}
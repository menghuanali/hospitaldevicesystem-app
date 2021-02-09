package com.pch.demo.ui.popup;

import android.content.Context;

import com.pch.base.BasePopupWindow;
import com.pch.demo.R;

/**
 *    author : 潘成花
 *    
 *    time   : 2020/10/18
 *    desc   : 可进行拷贝的副本
 */
public final class CopyPopup {

    public static final class Builder
            extends BasePopupWindow.Builder<Builder> {

        public Builder(Context context) {
            super(context);

            setContentView(R.layout.copy_popup);
        }
    }
}
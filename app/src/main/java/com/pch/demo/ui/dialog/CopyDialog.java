package com.pch.demo.ui.dialog;

import android.content.Context;
import android.view.Gravity;

import com.pch.base.BaseDialog;
import com.pch.demo.R;

/**
 *    author : 潘成花
 *    
 *    time   : 2020/10/18
 *    desc   : 可进行拷贝的副本
 */
public final class CopyDialog {

    public static final class Builder
            extends BaseDialog.Builder<Builder> {

        public Builder(Context context) {
            super(context);

            setContentView(R.layout.copy_dialog);
            setAnimStyle(BaseDialog.ANIM_BOTTOM);
            setGravity(Gravity.BOTTOM);
        }
    }
}
package com.pch.demo.action;

import androidx.annotation.StringRes;

import com.hjq.toast.ToastUtils;

/**
 *    author : 潘成花
 *    
 *    time   : 2020/02/08
 *    desc   : 吐司意图
 */
public interface ToastAction {

    default void toast(CharSequence text) {
        ToastUtils.show(text);
    }

    default void toast(@StringRes int id) {
        ToastUtils.show(id);
    }

    default void toast(Object object) {
        ToastUtils.show(object);
    }
}
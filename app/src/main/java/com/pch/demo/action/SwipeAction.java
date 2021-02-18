package com.pch.demo.action;

/**
 *    author : 潘成花
 *
 *    time   : 2021/02/08
 *    desc   : 侧滑意图
 */
public interface SwipeAction {

    /**
     * 是否使用侧滑
     */
    default boolean isSwipeEnable() {
        // 默认开启
        return true;
    }
}
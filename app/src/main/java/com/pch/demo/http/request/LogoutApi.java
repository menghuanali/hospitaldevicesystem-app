package com.pch.demo.http.request;

import com.hjq.http.config.IRequestApi;

/**
 *    author : 潘成花
 *
 *    time   : 2020/02/07
 *    desc   : 退出登录
 */
public final class LogoutApi implements IRequestApi {

    @Override
    public String getApi() {
        return "user/logout";
    }
}
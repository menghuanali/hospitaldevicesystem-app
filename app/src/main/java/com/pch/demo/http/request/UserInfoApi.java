package com.pch.demo.http.request;

import com.hjq.http.config.IRequestApi;

/**
 *    author : 潘成花
 *    
 *    time   : 2021/02/07
 *    desc   : 获取用户信息
 */
public final class UserInfoApi implements IRequestApi {

    @Override
    public String getApi() {
        return "user/info";
    }
}
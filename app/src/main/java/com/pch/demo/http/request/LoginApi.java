package com.pch.demo.http.request;

import com.hjq.http.config.IRequestApi;

/**
 *    author : 潘成花
 *    time   : 2020/02/07
 *    desc   : 用户登录
 */
public final class LoginApi implements IRequestApi {

    @Override
    public String getApi() {
        return "auth/loginapp";
    }

    /** 手机号 */
    private String tel;
    /** 登录密码 */
    private String password;

    public LoginApi setPhone(String phone) {
        this.tel = phone;
        return this;
    }

    public LoginApi setPassword(String password) {
        this.password = password;
        return this;
    }
}
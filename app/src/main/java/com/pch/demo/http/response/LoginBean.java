package com.pch.demo.http.response;

/**
 *    author : 潘成花
 *    time   : 2021/02/07
 *    desc   : 登录返回
 */
public final class LoginBean {

    private String token;
    private String message;
    private String error;
    public String getToken() {
        return token;
    }

    public String getMessage() {
        return message;
    }

    public String getError() {
        return error;
    }
}
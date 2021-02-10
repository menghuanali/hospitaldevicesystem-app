package com.pch.demo.http.request;

import com.hjq.http.config.IRequestApi;

/**
 *    author : 潘成花
 *    
 *    time   : 2020/02/07
 *    desc   : 验证码校验
 */
public final class VerifyCodeApi implements IRequestApi {

    @Override
    public String getApi() {
        return "code/checkout";
    }

    /** 手机号 */
    private String phone;
    /** 验证码 */
    private String code;

    public VerifyCodeApi setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public VerifyCodeApi setCode(String code) {
        this.code = code;
        return this;
    }
}
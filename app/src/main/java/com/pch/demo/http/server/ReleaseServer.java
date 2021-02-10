package com.pch.demo.http.server;

import com.hjq.http.config.IRequestServer;
import com.hjq.http.model.BodyType;

/**
 *    author : 潘成花
 *    time   : 2020/02/07
 *    desc   : 正式环境
 */
public class ReleaseServer implements IRequestServer {

    @Override
    public String getHost() {
        return "http://10.0.2.2:8100/";
    }

    @Override
    public BodyType getType() {
        // 参数以 Json 格式提交（默认是表单）
        return BodyType.JSON;
    }
}
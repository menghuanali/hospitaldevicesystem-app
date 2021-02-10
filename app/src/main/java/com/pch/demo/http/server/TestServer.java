package com.pch.demo.http.server;

/**
 *    author : 潘成花
 *    time   : 2020/02/07
 *    desc   : 测试环境
 */
public class TestServer extends ReleaseServer {

    @Override
    public String getHost() {
        return "http://10.0.2.2:8100/";
    }
}
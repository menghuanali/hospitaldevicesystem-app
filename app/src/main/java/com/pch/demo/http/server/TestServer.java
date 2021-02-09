package com.pch.demo.http.server;

/**
 *    author : 潘成花
 *    
 *    time   : 2020/12/07
 *    desc   : 测试环境
 */
public class TestServer extends ReleaseServer {

    @Override
    public String getHost() {
        return "https://www.baidu.com/";
    }
}
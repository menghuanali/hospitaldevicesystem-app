package com.pch.demo.http.server;

import com.hjq.http.config.IRequestServer;

/**
 *    author : 潘成花
 *    
 *    time   : 2020/12/07
 *    desc   : 正式环境
 */
public class ReleaseServer implements IRequestServer {

    @Override
    public String getHost() {
        return "https://www.baidu.com/";
    }

    @Override
    public String getPath() {
        return "api/";
    }
}
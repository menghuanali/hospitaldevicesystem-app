package com.pch.demo.http.request;

import com.hjq.http.config.IRequestApi;

/**
 *    author : 潘成花
 *    
 *    time   : 2021/02/07
 *    desc   : 可进行拷贝的副本
 */
public final class NoticeApi implements IRequestApi {

    @Override
    public String getApi() {
        return "notice/getAll";
    }
}
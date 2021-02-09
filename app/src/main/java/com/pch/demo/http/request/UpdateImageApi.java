package com.pch.demo.http.request;

import com.hjq.http.config.IRequestApi;

import java.io.File;

/**
 *    author : 潘成花
 *
 *    time   : 2020/12/07
 *    desc   : 上传图片
 */
public final class UpdateImageApi implements IRequestApi {

    @Override
    public String getApi() {
        return "update/image";
    }

    /** 图片文件 */
    private File image;

    public UpdateImageApi setImage(File image) {
        this.image = image;
        return this;
    }
}
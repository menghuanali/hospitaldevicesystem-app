package com.pch.demo.http.response;

/**
 *    author : 潘成花
 *    time   : 2021/02/07
 *    desc   : 可进行拷贝的副本
 */
public final class NoticeBean {
    private String id;
    private String type;
    private String title;
    private String content;
    private String pictureUrl;
    private String createName;
    private String createTime;
    private String updateName;
    private String updateTime;

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public String getCreateName() {
        return createName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getUpdateName() {
        return updateName;
    }

    public String getUpdateTime() {
        return updateTime;
    }
}
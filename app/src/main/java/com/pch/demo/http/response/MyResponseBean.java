package com.pch.demo.http.response;

/**
 *    author : 潘成花
 *    time   : 2021/02/07
 *    desc   : 这是返回对象的大集合包含了可能用到的所有字段
 */
public final class MyResponseBean {
    private Long id;
    /*
        含义有 公告的类型
    */
    private String type;
    /*
        含义有 公告的标题
    */
    private String title;
    /*
        含义有 公告的内容
    */
    private String content;
    /*
        含义有 公告的图片
    */
    private String pictureUrl;
    private String createName;
    private String createTime;
    private String updateName;
    private String updateTime;
    private Integer version;
    private Integer delete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }
}
package com.pch.demo.http.model;

import com.pch.demo.http.response.MyResponseBean;

import java.util.List;

public class PchHttpData {
    /** 返回码 */
    private String error;
    /** 提示语 */
    private String message;
    /** 单个对象 */
    private MyResponseBean item;
    /** 返回的对象列表 */
    private List<MyResponseBean> list;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MyResponseBean getItem() {
        return item;
    }

    public void setItem(MyResponseBean item) {
        this.item = item;
    }

    public List<MyResponseBean> getList() {
        return list;
    }

    public void setList(List<MyResponseBean> list) {
        this.list = list;
    }
}

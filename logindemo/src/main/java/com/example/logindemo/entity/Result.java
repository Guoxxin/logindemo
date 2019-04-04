package com.example.logindemo.entity;

/**
 * @author:guoxin
 * @date:2019/3/20 15:56
 * @description:
 */
public class Result {
    private Integer status;
    private String msg;
    private Object object;

    public Result(Integer status, String msg, Object object) {
        this.status = status;
        this.msg = msg;
        this.object = object;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}

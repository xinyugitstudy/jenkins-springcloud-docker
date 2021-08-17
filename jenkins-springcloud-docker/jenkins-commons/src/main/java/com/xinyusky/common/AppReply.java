package com.xinyusky.common;

import java.io.Serializable;

/**
 * @author Administrator
 * @description
 * @date 2021/8/17 15:38
 * @change 2021/8/17 15:38 by 邮箱 for init
 */

public class AppReply<T> implements Serializable {
    private static final long serialVersionUID = -5400543782459168105L;

    /**
     *返回编码
     */
    private String code;

    /**
     *返回消息
     */
    private String message;

    /**
     *返回数据
     */
    private T data;

    public AppReply() { }

    public AppReply(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

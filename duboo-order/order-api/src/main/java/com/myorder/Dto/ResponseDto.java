package com.myorder.Dto;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class ResponseDto implements Serializable {

    private String code;

    private String msg;

    private Object t;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getT() {
        return t;
    }

    public void setT(Object t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", t=" + t +
                '}';
    }
}

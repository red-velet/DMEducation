package com.dm.education.Utils;

public class JsonResultVo {

    private String msg;
    private Integer code;// 成功返回200   失败默认返回1
    private Object data;

    public JsonResultVo() {
    }

    public JsonResultVo(String msg, Integer code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public static JsonResultVo ok() {
        return new JsonResultVo("操作成功", 200, null);
    }

    public static JsonResultVo ok(String msg) {
        return new JsonResultVo(msg, 200, null);
    }

    public static JsonResultVo ok(Object data) {
        return new JsonResultVo("操作成功", 200, data);
    }

    public static JsonResultVo ok(String msg, Object data) {
        return new JsonResultVo(msg, 200, data);
    }

    public static JsonResultVo error(String msg) {
        return new JsonResultVo(msg, 1, null);
    }

    public static JsonResultVo error(String msg, Integer code) {
        return new JsonResultVo(msg, code, null);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
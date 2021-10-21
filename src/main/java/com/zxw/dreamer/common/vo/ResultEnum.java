package com.zxw.dreamer.common.vo;


import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author zxw
 * @date 2021-10-19
 */
public enum ResultEnum {
    /**
     * 请求正确
     */
    SUCCESS_CODE("请求成功"),
    /**
     * 请求失败
     */
    ERROR_CODE("请求失败");

    private final String description;


    public String getDescription(){
        return description;
    }

    ResultEnum(String description) {
        this.description = description;
    }
}

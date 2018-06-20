package com.learn.enums;

/**
 * Description:支付状态
 * All Rights Reserved.
 *
 * @version 1.0 2018-06-20 by aguai
 */
public enum PayStausEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功");

    private Integer code;
    private String name;

    PayStausEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

package com.learn.enums;

/**
 * Description:订单状态
 * All Rights Reserved.
 *
 * @version 1.0 2018-06-20 by aguai
 */
public enum  OrderStatusEnum {

    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"取消");

    private Integer code;
    private String name;

    OrderStatusEnum(Integer code, String name) {
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

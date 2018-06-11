package com.learn.enums;

/**
 * Description:商品状态
 * All Rights Reserved.
 *
 * @version 1.0 2018-06-11 by aguai
 */
public enum  ProductStatusEnum {
    UP(0,"在架"),
    OFF(1,"下架");

    private Integer index;

    private String name;

    ProductStatusEnum(Integer index, String name) {
        this.index = index;
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

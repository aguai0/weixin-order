package com.learn.vo;

import lombok.Data;

/**
 * Description:http请求返回的最外层对象
 * All Rights Reserved.
 *
 * @version 1.0 2018-06-11 by aguai
 */
@Data
public class ResultVo<T> {

    /** 错误码*/
    private Integer code;

    /** 提示信息*/
    private String message;

    /** 具体内容*/
    private T data;
}

package com.learn;

import com.learn.vo.ResultVo;

/**
 * Description:
 * All Rights Reserved.
 *
 * @version 1.0 2018-06-13 by aguai
 */
public class ResultVoUtil {

    public static ResultVo success(Object obj){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMessage("成功");
        resultVo.setData(obj);
        return  resultVo;
    }

    public static ResultVo success(){
        return success(null);
    }

    public static ResultVo error(Integer code ,String message){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(code);
        resultVo.setMessage(message);
        return resultVo;
    }
}

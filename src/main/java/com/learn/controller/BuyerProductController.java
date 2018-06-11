package com.learn.controller;

import com.learn.service.ProductInfoService;
import com.learn.vo.ProductInfoVo;
import com.learn.vo.ProductVo;
import com.learn.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Description:买家商品
 * All Rights Reserved.
 *
 * @version 1.0 2018-06-11 by aguai
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    ProductInfoService productInfoService;

    @GetMapping("/list")
    public ResultVo queryList(){
        ResultVo resultVo = new ResultVo();
        ProductVo productVo = new ProductVo();
        List<ProductVo> productVoList = Arrays.asList(productVo);

        ProductInfoVo productInfoVo = new ProductInfoVo();
        List<ProductInfoVo> productInfoVoList = Arrays.asList(productInfoVo);
        productVo.setProductInfoVos(productInfoVoList);

        resultVo.setData(productVoList);
        resultVo.setCode(0);
        resultVo.setMessage("成功");
        return  resultVo;
    }
}

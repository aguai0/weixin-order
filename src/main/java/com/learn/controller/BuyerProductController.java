package com.learn.controller;

import com.learn.ResultVoUtil;
import com.learn.dataobject.ProductCategory;
import com.learn.dataobject.ProductInfo;
import com.learn.service.ProductCategoryService;
import com.learn.service.ProductInfoService;
import com.learn.vo.ProductInfoVo;
import com.learn.vo.ProductVo;
import com.learn.vo.ResultVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @Autowired
    ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public ResultVo queryList(){
        ResultVo resultVo = new ResultVo();

        //所有上线商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();

        /*List<Integer> categoryTypes = new ArrayList<>();
        for(ProductInfo productInfo : productInfoList){
            categoryTypes.add(productInfo.getCategoryType());
        }*/
        List<Integer> categoryTypes = productInfoList.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());
        //根据商品类别查询商品条目
        List<ProductCategory> productCategories = productCategoryService.findByCategoryTypeIn(categoryTypes);

        List<ProductVo> productVoList = new ArrayList<>();
        for(ProductCategory productCategory : productCategories){
            ProductVo productVo = new ProductVo();
            productVo.setCategoryName(productCategory.getCategoryName());
            productVo.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVo> productInfoVoList = new ArrayList<>();
            for(ProductInfo productInfo : productInfoList){
                if(productCategory.getCategoryType().equals(productInfo.getCategoryType())){
                    ProductInfoVo productInfoVo = new ProductInfoVo();
                    BeanUtils.copyProperties(productInfo,productInfoVo);
                    productInfoVoList.add(productInfoVo);
                }
            }
            productVo.setProductInfoVos(productInfoVoList);
            productVoList.add(productVo);
        }
        return ResultVoUtil.success(productVoList);
    }
}

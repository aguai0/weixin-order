package com.learn.service;

import com.learn.dataobject.ProductCategory;

import java.util.List;

/**
 * Description:
 * All Rights Reserved.
 *
 * @version 1.0 2018-06-10 by aguai
 */
public interface ProductCategoryService {

    public ProductCategory findByOne(Integer id);

    public List<ProductCategory> findByAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> list);
}

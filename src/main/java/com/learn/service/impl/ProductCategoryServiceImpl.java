package com.learn.service.impl;

import com.learn.dataobject.ProductCategory;
import com.learn.respository.ProductCategoryRepository;
import com.learn.service.ProductCategoryServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * All Rights Reserved.
 *
 * @version 1.0 2018-06-10 by aguai
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryServcie {

    @Autowired
    ProductCategoryRepository categoryRepository;

    @Override
    public ProductCategory findByOne(Integer id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public List<ProductCategory> findByAll() {
        return categoryRepository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> list) {
        return categoryRepository.findByCategoryTypeIn(list);
    }
}

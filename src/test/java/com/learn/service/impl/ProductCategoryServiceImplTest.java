package com.learn.service.impl;

import com.learn.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {
    /** 日志记录器 */
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductCategoryServiceImplTest.class);

    @Autowired
    ProductCategoryServiceImpl productCategoryService;

    @Test
    public void findByOne() throws Exception {
        ProductCategory category = productCategoryService.findByOne(1);
        LOGGER.info(category.toString());
    }

    @Test
    public void findByAll() throws Exception {
        List<ProductCategory>  list = productCategoryService.findByAll();
        System.out.println(list.toString());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer>  list = Arrays.asList(1,2);
        List<ProductCategory> productCategories = productCategoryService.findByCategoryTypeIn(list);
        System.out.println(productCategories.toString());
    }

}
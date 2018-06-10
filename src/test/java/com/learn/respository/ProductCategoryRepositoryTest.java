package com.learn.respository;

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
public class ProductCategoryRepositoryTest {
    /** 日志记录器 */
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductCategoryRepositoryTest.class);
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findAllTest(){
        ProductCategory productCategory = repository.getOne(1);
      // List<ProductCategory> list = repository.findAll();

        LOGGER.info("productCategory:"+productCategory.toString());
    }

    @Test
    public void insertTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("类目2");
        productCategory.setCategoryType(2);
        repository.save(productCategory);
    }

    @Test
    public void updateTest(){
        ProductCategory productCategory = repository.getOne(1);
        productCategory.setCategoryName("类目1");
        repository.save(productCategory);
    }

    @Test
    public void findByTest(){
        List<Integer> list = Arrays.asList(1,2,3);

        List<ProductCategory> productCategories = repository.findByCategoryTypeIn(list);
        LOGGER.info(productCategories.toString());
    }

}
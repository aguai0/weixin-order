package com.learn.respository;

import com.learn.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    /** 日志记录器 */
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductInfoRepositoryTest.class);

    @Autowired
    ProductInfoRepository repository;

    @Test
    public void saveProductInfo(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1");
        productInfo.setProductName("拉条");
        productInfo.setProductPrice(new BigDecimal(5.12));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("狠辣");
        productInfo.setProductIcon("http://xxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        ProductInfo result = repository.save(productInfo);
        LOGGER.info(result.toString());
    }

    @Test
    public void findByProductStatus() throws Exception {

        List<ProductInfo> list =  repository.findByProductStatus(0);
        LOGGER.info(list.toString());
    }

}
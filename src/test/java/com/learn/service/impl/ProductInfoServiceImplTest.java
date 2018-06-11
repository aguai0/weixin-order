package com.learn.service.impl;

import com.learn.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    /** 日志记录器 */
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductInfoServiceImplTest.class);

    @Autowired
    ProductInfoServiceImpl productInfoService;


    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo = productInfoService.findOne("1");
        LOGGER.info(productInfo.toString());
    }

    @Test
    public void findUpAll() throws Exception {
    }

    @Test
    public void findAll() throws Exception {
        PageRequest pageRequest = new PageRequest(0,2);
        Page<ProductInfo> productInfos = productInfoService.findAll(pageRequest);
        LOGGER.info("----"+productInfos.getTotalElements());
    }

    @Test
    public void save() throws Exception {

        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("2");
        productInfo.setProductName("狗不理");
        productInfo.setProductPrice(new BigDecimal(9.9));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很香");
        productInfo.setProductIcon("http://xxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        productInfoService.save(productInfo);
    }

}
package com.learn.respository;

import com.learn.dataobject.OrderMaster;
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
public class OrderMasterRepositoryTest {
/** 日志记录器 */
private static final Logger LOGGER = LoggerFactory.getLogger(OrderMasterRepositoryTest.class);
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void save(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("111");
        orderMaster.setBuyerOpenid("11");
        orderMaster.setBuyerName("test1");
        orderMaster.setBuyerAddress("test111111111");
        orderMaster.setBuyerPhone("13512123232");
        orderMaster.setOrderAmount(new BigDecimal(1.2));
        orderMasterRepository.save(orderMaster);
    }

    @Test
    public void findByBuyerOpenid() throws Exception {

        PageRequest pageRequest = new PageRequest(0,1);
        Page<OrderMaster> orderMasters = orderMasterRepository.findByBuyerOpenid("11", pageRequest);
        LOGGER.info("ordermasters:"+ orderMasters.getTotalElements());
    }

}
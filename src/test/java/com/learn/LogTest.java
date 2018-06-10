package com.learn;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description:
 * All Rights Reserved.
 *
 * @version 1.0 2018-06-02 by aguai
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LogTest {

    /** 日志记录器 */
    private static final Logger LOGGER = LoggerFactory.getLogger(LogTest.class);
    @Test
    public void test1(){
        log.debug("debug .....");
        LOGGER.info("info ....");
        log.error("error ......");
    }
}

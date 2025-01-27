package com.dx.republic.testjenkines;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@SpringBootTest
@RunWith(SpringRunner.class)
class TestJenkinsApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(TestJenkinsApplication.class);

    @Test
    void contextLoads() {
        logger.info("test case is executing....");
        assertTrue(true);
    }

}

package com.dx.republic.testjenkines;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJenkinsApplication {

     public static Logger logger = LoggerFactory.getLogger(TestJenkinsApplication.class);

     @PostConstruct
     public void init(){
         logger.info("Application is started.....");
     }

    public static void main(String[] args) {
        logger.info("Application is executed.....");
        SpringApplication.run(TestJenkinsApplication.class, args);
    }

}

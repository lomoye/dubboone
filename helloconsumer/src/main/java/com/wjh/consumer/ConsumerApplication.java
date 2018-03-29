package com.wjh.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by WJH on 2018年03月18日 20:23
 */
@SpringBootApplication
//@ComponentScan
@ImportResource(value = {"classpath:dubbo-consumer.xml"})
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}

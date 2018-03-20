package com.wjh.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by WJH on 2018年03月18日 15:25
 */
@SpringBootApplication
@ImportResource(value = {"classpath:hello-provider.xml"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}

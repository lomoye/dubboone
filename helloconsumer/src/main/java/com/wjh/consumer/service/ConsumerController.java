package com.wjh.consumer.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import provider.Hello;

import javax.annotation.Resource;

/**
 * Created by WJH on 2018年03月18日 21:08
 */
@RestController
public class ConsumerController {

    @Resource(name = "helloService")
    private Hello hello;

    @RequestMapping("/test")
    private String ceshi(){
        if (hello != null){
            System.out.println("success");
            hello.learnDubbo();
        }
        return "success";
    }
}

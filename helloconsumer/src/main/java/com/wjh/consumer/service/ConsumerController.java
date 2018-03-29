package com.wjh.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import provider.Hello;

import javax.annotation.Resource;

/**
 * Created by WJH on 2018年03月18日 21:08
 */
@RestController
public class ConsumerController {

    @Autowired
    private Hello hello;

    @RequestMapping("/test")
    private String ceshi(){

        return hello.learnDubbo();
    }
}

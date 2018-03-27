package com.wjh.dubbo.service;

import org.springframework.stereotype.Service;
import provider.Hello;

/**
 * Created by WJH on 2018年03月18日 16:00
 */
@Service(value = "helloService")
public class HelloImpl implements Hello {

    public String learnDubbo() {
        return "dubbo is very nice rpc framework!";
    }
}

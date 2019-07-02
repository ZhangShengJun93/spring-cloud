package com.stupidzhang.consumer.service.impl;

import com.stupidzhang.consumer.service.HelloRemote;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author :zhangshengjun
 * @create 2019-07-02 11:21
 **/
@Service
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + ", this messge send failed ";
    }
}

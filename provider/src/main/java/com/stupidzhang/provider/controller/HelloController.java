package com.stupidzhang.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这是入口
 *
 * @author :zhangshengjun
 * @create 2019-07-02 9:47
 **/
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello " + name + port + "，this is first messge";
    }
}

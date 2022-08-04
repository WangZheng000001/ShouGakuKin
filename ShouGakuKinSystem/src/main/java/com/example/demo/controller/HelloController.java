package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        //调用业务,接受前端的参数
        return "hello,world";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        //调用业务,接受前端的参数
        return "hello2,world";
    }
}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {
    //接口:http://localhost:8080/hello2
    @RequestMapping("/hello2")
    public String hello2() {
        //调用业务,接收前端的参数!
        return "hello2,world";
    }
}

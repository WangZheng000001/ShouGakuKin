package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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

    @PostMapping("/loginCheck")
    //HttpServletRequest对象代表客户端的请求，当客户端通过HTTP协议访问服务器时，HTTP请求头中的所有信息都封装在这个对象中，开发人员通过这个对象的方法，可以获得客户这些信息。
    public String loginCheck(HttpServletRequest request) {
        System.out.println("如下");
        String id=request.getParameter("studentID");
        String password=request.getParameter("passWord");
        System.out.println("studentID:"+id);
        System.out.println("passWord:"+password);

        return "redirect:NewFile.html";


    }
}

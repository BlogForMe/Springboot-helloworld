package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Value("$name")
    private String name;

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot!";
    }


    @RequestMapping("/hello2")
    public String hello2(){
        System.out.println(name);
        return "hello spring boot 222!";
    }

}

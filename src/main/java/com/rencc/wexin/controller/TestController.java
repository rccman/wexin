package com.rencc.wexin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试Controller
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    @RequestMapping("/index")
    public String index(){
        return "WeChart project on Spring Boot";
    }
}

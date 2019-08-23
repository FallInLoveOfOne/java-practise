package com.hensu.javapractise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sh
 * @Description: HelloController
 * @Date: 14:33 2019/8/23
 */
@RestController("/hello/")
public class HelloController {

    @GetMapping("/index/")
    public String hello(){
        return "hello";
    }
}

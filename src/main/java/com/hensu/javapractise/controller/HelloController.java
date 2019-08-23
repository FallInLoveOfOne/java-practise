package com.hensu.javapractise.controller;

import com.alibaba.fastjson.JSON;
import com.hensu.javapractise.model.Seal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: sh
 * @Description: HelloController
 * @Date: 14:33 2019/8/23
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(value = "/index",produces = {"application/json;charset=UTF-8"})
    public String hello(){
        Seal seal = new Seal();
        seal.setId(UUID.randomUUID().toString());
        seal.setNo("2009");
        seal.setName("公司专用章");
        return JSON.toJSONString(seal);
    }
}

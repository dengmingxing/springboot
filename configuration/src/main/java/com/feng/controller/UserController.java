package com.feng.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Anthor:liyunfeng
 * @CreateDate: 2019/4/29 10:06
 */
@RestController
public class UserController {
    @Value("${com.feng.name}")
     private static  String name;
    @Value("${com.feng.password}")
     private static String passwrod;


    @RequestMapping(value = "/user" ,method = RequestMethod.GET)
    public String hello(){
        return  name+":"+passwrod;
    }
}

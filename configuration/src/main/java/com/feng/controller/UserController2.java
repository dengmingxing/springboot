package com.feng.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Anthor:liyunfeng
 * @CreateDate: 2019/4/29 10:45
 */
@RestController
public class UserController2 {
    private static String name;
    private static String password;

   /* @Value("${com.feng.name}")
    public void setName(String name) {
        UserController2.name = name;
    }
    @Value("${com.feng.password}")
    public  void setPassword(String password) {
        UserController2.password = password;
    }*/
    @RequestMapping(value = "/user1",method = RequestMethod.GET)
    public String hello2(){
        return  name+";"+password;
    }
}

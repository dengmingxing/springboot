package com.feng.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Anthor:liyunfeng
 * @CreateDate: 2019/4/29 11:59
 */
@RestController
public class UserController {
    @Value("${com.feng.name}")
    private String name;
    @Value("${com.feng.password}")
    private String password;
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String user(){
        return  name+":"+password;
    }
}

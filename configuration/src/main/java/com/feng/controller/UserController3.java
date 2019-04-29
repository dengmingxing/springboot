package com.feng.controller;

import com.feng.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Anthor:liyunfeng
 * @CreateDate: 2019/4/29 11:24
 */
@RestController
public class UserController3 {
    @Autowired
    public User user;
    @RequestMapping(value = "/user2",method = RequestMethod.GET)
    public String hello3(){
        return user.getName()+":"+user.getPassword();
    }
}

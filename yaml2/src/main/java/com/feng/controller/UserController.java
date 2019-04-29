package com.feng.controller;

import com.feng.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Anthor:liyunfeng
 * @CreateDate: 2019/4/29 14:02
 */
@RestController
public class UserController {
    @Autowired
    private User user;
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String user(){
        return  user.getName()+":"+user.getPassword();
    }
}

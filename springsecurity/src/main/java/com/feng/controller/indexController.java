package com.feng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Anthor:liyunfeng
 * @CreateDate: 2019/5/5 16:39
 */
@RestController
@RequestMapping("/index")
public class indexController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return  "欢迎访问登录页面";
    }

}

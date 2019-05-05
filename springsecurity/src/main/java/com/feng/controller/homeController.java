package com.feng.controller;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Anthor:liyunfeng
 * @CreateDate: 2019/5/5 16:41
 */
@RestController
@RequestMapping("/home")
public class homeController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        return "首页";
    }

    /**
     * @PreAuthorize("hasRole(ADMIN)")这是在该方法执行之前需要对角色进行验证的才能访问
     * @PreAuthorize("hasRole('ADMIN') AND hasRole('USER')")该角色可以定义多个
     *@PostAuthorize("returnObject==authentication.name")是在该方法执行之后才进行验证，一般不适用，作用于对返回值的验证
     * @return
     */
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @PreAuthorize("hasRole('ADMIN')")
    public String user(){
        return "非管理员不能访问";
    }
}

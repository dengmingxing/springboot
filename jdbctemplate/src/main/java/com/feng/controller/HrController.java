package com.feng.controller;

import com.feng.bean.Hr;
import com.feng.service.HrServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Anthor:liyunfeng
 * @CreateDate: 2019/4/29 14:37
 */
@RestController
public class HrController {
    @Autowired
    private HrServiceImpl hrService;
    @RequestMapping(value = "/hr",method = RequestMethod.GET)
    public List<Hr>  getAllHr(){
        return  hrService.getAllHr();
    }
}

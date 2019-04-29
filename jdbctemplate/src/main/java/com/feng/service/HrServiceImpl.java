package com.feng.service;

import com.feng.bean.Hr;
import com.feng.dao.HrDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Anthor:liyunfeng
 * @CreateDate: 2019/4/29 14:36
 */
@Service
public class HrServiceImpl implements  HrService {
    @Autowired
    private HrDaoImpl hrDaoImpl;
    @Override
    public List<Hr> getAllHr() {
        return hrDaoImpl.getAllHr();
    }
}

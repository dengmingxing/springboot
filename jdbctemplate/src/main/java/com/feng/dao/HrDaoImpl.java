package com.feng.dao;

import com.feng.bean.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Anthor:liyunfeng
 * @CreateDate: 2019/4/29 14:31
 */
@Repository
public class HrDaoImpl implements  HrDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Hr> getAllHr() {
        return jdbcTemplate.query("select * from Hr ",new Object[]{},new BeanPropertyRowMapper<>(Hr.class)) ;
    }
}

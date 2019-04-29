package com.feng.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Anthor:liyunfeng
 * @CreateDate: 2019/4/29 11:21
 */
@Component
@ConfigurationProperties(prefix = "my")
@PropertySource("classpath:test.properties")
public class User {
    @Value("${my.name}")
    private String name;
    @Value("${my.password}")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

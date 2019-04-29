package com.feng.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Anthor:liyunfeng
 * @CreateDate: 2019/4/29 14:00
 */
@Component
@ConfigurationProperties(prefix = "com.feng")
@PropertySource("classpath:application.yml")
public class User {
    private String name;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

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
}

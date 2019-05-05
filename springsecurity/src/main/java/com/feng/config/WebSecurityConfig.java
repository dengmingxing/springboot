package com.feng.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

/**
 * @Anthor:liyunfeng
 * @CreateDate: 2019/5/5 16:43
 */
@Configuration
@Component
@EnableGlobalMethodSecurity(prePostEnabled = true)//这是开启全局的安全认证在方法请求之前
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 该方法是用来保存本地的用户信息
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //这是直接从内存中取用户信息
        auth.inMemoryAuthentication().passwordEncoder(new MyPasswordEncoder()).withUser("admin").password("123456").roles("ADMIN");
        auth.inMemoryAuthentication().passwordEncoder(new MyPasswordEncoder()).withUser("zhangsan").password("456").roles("ADMIN");
        auth.inMemoryAuthentication().passwordEncoder(new MyPasswordEncoder()).withUser("lisi").password("123456").roles("USER");
        /**
         * 这是直接从数据库中查询用户数据
         */
        //auth.userDetailsService(userService).passwordEncoder();
    }

    /**
     * 这是用来处理前端拦击的
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/index.html","/static/**","/login_p","/favicon.ico");
    }

    /**
     * 这个方法是用来处理http请求的,在这里处理与用户登陆请求的一切数据
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/index/").permitAll()//主路径请求不需要认证
                .anyRequest().authenticated()//其他任何请求都需要认证
                .and()
                .logout().permitAll()//这是注销
                .and()
                .formLogin();//允许表单登录
        http.csrf().disable();//关闭csrf的认证
    }
}

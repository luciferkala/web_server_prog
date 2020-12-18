package com.seoultech.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            // ...
            http
                    .requestMatchers()
                    .mvcMatchers("/login/**", "/logout/**", "/private/**", "/admin/**", "/", "/profile/**", "/my-login"); // /my-login 을 시큐리티 관리포인트에 추가하였다.
        }

        @Bean
        @Override
        public AuthenticationManager authenticationManagerBean() throws Exception {
            return super.authenticationManagerBean();
        }
}

package com.zengqiang.future.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(
    basePackages = "com.zengqiang.future.controller"
)
public class SpringMvcConfiguration {

}

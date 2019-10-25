package com.spring.boot.mybatisplus.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("com.spring.boot.mybatisplus.mapper")
@Configuration
public class MyBatisPlusConfig {
}

package com.smj.service.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.smj.service.mapper")
public class MyBatisPlusConfig {

    @Bean
    public PaginationInterceptor page() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();

        return paginationInterceptor;
    }
}

package com.f103.it.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(SessionFactoryConfig.class)
public class MapperScannerConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapper = new MapperScannerConfigurer();
        mapper.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapper.setBasePackage("com.f103.it.dao");

        return mapper;
    }
}

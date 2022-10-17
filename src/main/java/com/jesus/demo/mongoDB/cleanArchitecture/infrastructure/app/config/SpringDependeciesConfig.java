package com.jesus.demo.mongoDB.cleanArchitecture.infrastructure.app.config;

import com.jesus.demo.mongoDB.cleanArchitecture.adapter.repository.DespachoAdapterRepository;
import com.jesus.demo.mongoDB.cleanArchitecture.infrastructure.repository.dao.DespachoDao;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.jesus.demo.mongoDB.cleanArchitecture")
public class SpringDependeciesConfig {

    private final DespachoDao despachoDao;

    public SpringDependeciesConfig(DespachoDao despachoDao) {
        this.despachoDao = despachoDao;
    }

    @Bean
    public DespachoAdapterRepository despachoAdapterRepository(){
        return new DespachoAdapterRepository(despachoDao);
    }
}

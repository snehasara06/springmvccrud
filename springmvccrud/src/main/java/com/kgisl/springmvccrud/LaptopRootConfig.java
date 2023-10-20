package com.kgisl.springmvccrud;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
// @ComponentScan(basePackages = "com.kgisl.springmvccrud")
public class LaptopRootConfig {
    
    @Bean
    public DataSource dataSource()
    {
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/ebookshop");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        return dataSource;
    }
}

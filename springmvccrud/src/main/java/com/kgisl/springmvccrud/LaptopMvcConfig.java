package com.kgisl.springmvccrud;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.kgisl.springmvccrud")
public class LaptopMvcConfig {

  @Autowired
  DataSource dataSource;
    
   @Bean
   public JdbcTemplate jdbcTemplate(DataSource datasource)
   {
      return new JdbcTemplate(dataSource);
   }

   @Bean
   public LaptopDAO laptopDAO(JdbcTemplate jdbcTemplate)
   {
    LaptopDAO laptopDAO=new LaptopDAO();
    laptopDAO.setTemplate(jdbcTemplate);
    return laptopDAO;
   }

   @Bean
   public InternalResourceViewResolver viewResolver()
   {
    InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
    viewResolver.setPrefix("/WEB-INF/jsp/");
    viewResolver.setSuffix(".jsp");
    return viewResolver;
   }
}
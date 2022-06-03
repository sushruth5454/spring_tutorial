package com.annotaions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.annotaions2"})
public class MyConfig {

    @Bean
    public Student getStudent(){
        return new Student();
    }
}

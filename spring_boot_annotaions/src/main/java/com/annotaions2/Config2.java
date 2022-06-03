package com.annotaions2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {
    @Bean
    public Dog getDog(){
        System.out.println("Dog method");
        System.out.println("dog barking");
        return new Dog();
    }
}

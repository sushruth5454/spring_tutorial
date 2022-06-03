package com.annotaions;

import com.annotaions2.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAnnotaionsApplication implements CommandLineRunner {

    @Autowired
    private Student student;
    @Autowired
    private Dog dog;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAnnotaionsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}

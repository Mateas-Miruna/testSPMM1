package com.example.testspmm1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootApp.class, args);


        MesajService mesajService = context.getBean(MesajService.class);
        mesajService.decodificaMesaje();
    }
}

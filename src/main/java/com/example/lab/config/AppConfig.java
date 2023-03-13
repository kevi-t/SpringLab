package com.example.lab.config;

import com.example.lab.controller.FruitController;
import com.example.lab.service.Fruit;
import com.example.lab.service.FruitService;
import com.example.lab.service.NonFruit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Fruit fruitService(){
        return new FruitService();
    }

    @Bean
    public Fruit nonFruit(){
        return new NonFruit();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public FruitController fruitController(){
        return new FruitController(nonFruit()); // Injection of fruitService dependency using controller
    }
}

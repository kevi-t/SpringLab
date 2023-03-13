package com.example.lab.service;

import org.springframework.stereotype.Component;
public class FruitService implements Fruit {
    @Override
    public String getFruitName(){
        return "Mango";
    }
}
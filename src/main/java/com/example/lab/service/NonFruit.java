package com.example.lab.service;

import org.springframework.stereotype.Component;

public class NonFruit implements Fruit{
    @Override
    public String getFruitName() {
        return "Not a Fruit";
    }
}

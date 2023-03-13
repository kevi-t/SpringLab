package com.example.lab.controller;

import com.example.lab.service.Fruit;
import com.example.lab.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class FruitController {

       private Fruit fruit;
       public FruitController(Fruit fruit){
           this.fruit =fruit;
       }
//    //@Autowired      //Field injector method
//    private FruitService fruitService;

//    @Autowired  //Automatically injects the FruitService bean in the controller    //Constructor injector  #Recommended
//    public FruitController(FruitService fruitService){
//        this.fruitService= fruitService;
//    }

//    @Autowired       //Setters injectors     #Not recommended
//    public void setFruitName(FruitService fruitService){
//        this.fruitService =fruitService;
//    }

//    private Fruit fruit;
//    @Autowired   // Loose Coupling          # @Qualifer helps avoid ambiquity between two beans fruitService/nonFruit
//    public FruitController(@Qualifier("fruitService") Fruit fruit){
//        this.fruit = fruit;
//    }

    public String getFruitName(){
        return fruit.getFruitName();
    }

    public  void init(){
           System.out.println("Initialization logic");
    }
    public void destroy(){
           System.out.println("Destruction Logic");
    }
}
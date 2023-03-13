package com.example.lab;

import com.example.lab.controller.FruitController;
import com.example.lab.service.FruitService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(LabApplication.class, args);
		FruitController fruitController = (FruitController) context.getBean("fruitController");
		System.out.println(fruitController.getFruitName());

//		FruitService fruitService = context.getBean(FruitService.class);
//		System.out.println(fruitService.getFruitName());
	}

}

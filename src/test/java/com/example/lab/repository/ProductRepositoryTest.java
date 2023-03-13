package com.example.lab.repository;

import com.example.lab.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void saveMethod(){
        //create product
        Product product = new Product();
        product.setName("Plate");
        product.setDescription("Plastic");
        product.setSku("100A");
        product.setPrice(new BigDecimal(100));
        product.setActive(true);
        product.setImageUrl("product1.png");

        //save product
        Product saveObject = productRepository.save(product);

        //Display product info
        System.out.println(saveObject.getId());
        System.out.println(saveObject.toString());
    }

    @Test
    void updateUsingSaveMethod(){
        // Find and retrieve an entity by id
        Long id = 1L;
        Product product = productRepository.findById(id).get();

        //Update entity information
        product.setName("Cup");
        product.setDescription("Metallic");

        // Save updated entity
        productRepository.save(product);
    }

    @Test
    void  findByIdMethod(){
        Long id = 1L;
        Product product = productRepository.findById(id).get();
    }

    @Test
    void  saveAllMethod(){
        Product product = new Product();
        product.setName("Spoon");
        product.setDescription("Plastic");
        product.setSku("100B");
        product.setPrice(new BigDecimal(200));
        product.setActive(true);
        product.setImageUrl("product2.png");

        Product product2 = new Product();
        product.setName("Bucket");
        product.setDescription("Polythene");
        product.setSku("100C");
        product.setPrice(new BigDecimal(300));
        product.setActive(true);
        product.setImageUrl("product3.png");

        //Save multiple entities in the database
        productRepository.saveAll(List.of(product,product2));
    }

    @Test
    void findAllMethod(){
     List<Product> products = productRepository.findAll();
     products.forEach((p -> {
         System.out.println(p.getName());
     }));
    }

    @Test
     void deleteByIdMethod(){
         Long id = 1L;
         productRepository.deleteById(id);
     }

    @Test
    void deleteMethod(){

        //Find an entity by id
        Long id = 2L;
        Product product = productRepository.findById(id).get();

        // delete(entity)
        productRepository.delete(product);
    }

    @Test
    void deleteAllMethod(){
        
        //productRepository.deleteAll();
        
        Product product = productRepository.findById(5L).get();
        Product product1 = productRepository.findById(6L).get();
        productRepository.deleteAll(List.of(product,product1));
    }
    
    @Test
    void countMethod(){
       long count = productRepository.count();
       System.out.println(count);
    }

    @Test
    void existByIdMethod(){
        Long id = 1L;
        boolean result = productRepository.existsById(id);
        System.out.println(result);
    }

}
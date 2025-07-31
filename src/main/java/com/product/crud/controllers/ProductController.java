package com.product.crud.controllers;

import com.product.crud.dtos.ProductDto;
import com.product.crud.model.Product;
import com.product.crud.repositories.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")

public class ProductController {
    @Autowired
    ProductRepository repository;

    @GetMapping
    public ResponseEntity getAll(){
        List<Product> listProducts = repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(listProducts);
    }


    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable(value="id") Integer id){
      Optional product = repository.findById(id);
      if(product.isEmpty()) {
          return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");

      }
      return ResponseEntity.status(HttpStatus.FOUND).body(product.get());

    }



    @PostMapping
    public ResponseEntity save(@RequestBody ProductDto dto) {
        var product = new Product();
        BeanUtils.copyProperties(dto , product);
        return  ResponseEntity.status(HttpStatus.CREATED).body(repository.save(product));

    }
     @DeleteMapping{"/{id}")
    public ResponseEntity delete(@PathVariable(value = "id")Integer id) {
        Optional<Product> product = repository.findById(id);
        if (product.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
        }
        repository.delete(product.get());
        return ResponseEntity.status(HttpStatus.Ok).body("Product deleted");

    }


    @PutMapping("/{id}")

            public ResponseEntity update




}

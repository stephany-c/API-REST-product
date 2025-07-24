package com.product.crud.controllers;

import com.product.crud.model.Product;
import com.product.crud.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

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
}

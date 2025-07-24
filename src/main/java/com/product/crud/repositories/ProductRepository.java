package com.product.crud.repositories;

import com.product.crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Integer >{
}

package com.product.crud.model;

import jakarta.persistence.*;

@Entity(name="product")
@Table(name = "product")

public class Product {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Long price;

    public Long getPrice() {
        return price;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setPrice(Long price) {
        this.price = price;
    }
}

package com.product.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity(name="product")
@Table(name = "product")

public class Product {

    @id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer id;
    private String name;
    private Long prince;

    public Long getPrince() {
        return prince;
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

    public void setPrince(Long prince) {
        this.prince = prince;
    }
}

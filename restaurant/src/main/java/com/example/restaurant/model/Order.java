package com.example.restaurant.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order")
public class Order extends CategoryOrder{

    @Column(name = "price")
    private int price;
    @Column(name = "img")

    private String img;
    @Column(name = "description")

    private String description;
}
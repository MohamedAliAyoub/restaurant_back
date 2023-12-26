package com.example.restaurant.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orderFood")
public class Order extends CategoryOrder{

    @Column(name = "price")
    private int price;
    @Column(name = "img")

    private String img;
    @Column(name = "description")

    private String description;
}
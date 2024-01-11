package com.example.restaurant.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "item")
public class Item extends BaseEntity{

    @Column(name = "image")
    private String img;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private int price;

    @ManyToOne
    @JoinColumn(name = "request_order_id")
    private RequestOrder requestOrder;
}

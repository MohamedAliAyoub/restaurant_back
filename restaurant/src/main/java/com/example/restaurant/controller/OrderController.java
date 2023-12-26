package com.example.restaurant.controller;

import com.example.restaurant.service.OrderService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private  OrderService orderService ;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
}

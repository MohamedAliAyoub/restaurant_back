package com.example.restaurant.controller;

import com.example.restaurant.model.Order;
import com.example.restaurant.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    private  OrderService orderService ;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/api/allOrders")
    public List<Order> allOrders()
    {
        return orderService.allOrders();
    }
}

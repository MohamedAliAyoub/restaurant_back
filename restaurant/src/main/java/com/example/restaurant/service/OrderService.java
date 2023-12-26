package com.example.restaurant.service;

import com.example.restaurant.deo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRepository orderRepository ;

    @Autowired
    public  OrderService(OrderRepository orderRepository){
        this.orderRepository =orderRepository;
    }
}

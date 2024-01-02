package com.example.restaurant.service;

import com.example.restaurant.deo.OrderRepository;
import com.example.restaurant.model.Category;
import com.example.restaurant.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository ;

    @Autowired
    public  OrderService(OrderRepository orderRepository){
        this.orderRepository =orderRepository;
    }
    public List<Order> allOrders(){
        return orderRepository.findAll();
    }

    public List<Order> getOrdersByCategoryId(Long id){
        return orderRepository.findByCategoryId(id);
    }
    public List<Order> getOrderByKey(String key)
    {
        return orderRepository.findByNameContaining(key);
    }

}

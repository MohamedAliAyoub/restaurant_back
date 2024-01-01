package com.example.restaurant.controller;

import com.example.restaurant.model.Order;
import com.example.restaurant.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
@CrossOrigin({"http://localhost:4200" , "http://localhost:3100/"})
public class OrderController {
    private  OrderService orderService ;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("allOrders")
    public List<Order> allOrders()
    {
        return orderService.allOrders();
    }



    // http://localhost:8080/api/category?id={value}
    @GetMapping("category")
    public List<Order> getAllOrderByCategoryId(@RequestParam Long id){
        return orderService.getOrdersByCategoryId(id);
    }

    // http://localhost:8080/api/category/id
    /*@GetMapping("/api/category/{id}")
    public List<Order> getAllOrderByCategoryId(@PathVariable Long id){
        return orderService.getOrdersByIdCategories(id);
    }*/
}

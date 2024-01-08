package com.example.restaurant.controller;

import com.example.restaurant.model.Order;
import com.example.restaurant.service.OrderService;
import org.aspectj.weaver.ast.Or;
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
    public List<Order> allOrders(@RequestParam int page , @RequestParam int size)
    {
        return orderService.allOrders(page , size);
    }

    // http://localhost:8080/api/category?id={value}
    @GetMapping("category")
    public List<Order> getAllOrderByCategoryId(@RequestParam Long id , @RequestParam int page , @RequestParam int size){
        return orderService.getOrdersByCategoryId(id ,page , size);
    }

    // http://localhost:8080/api/orderKey?word=key
    @GetMapping("orderSearch")
    public  List<Order> getOrderByKey(@RequestParam String word , @RequestParam int page , @RequestParam int size)
    {
     return orderService.getOrderByKey(word , page , size);
    }


    // http://localhost:8080/api/order?id={value}
    @GetMapping("order")
    public Order getOrderById(@RequestParam Long id){
        return orderService.getOrder(id);
    }

    @GetMapping("orderSize")
    public long orderSize()
    {
        return orderService.getAllOrderSize();
    }

    @GetMapping("categoryIdSize")
    public long getOrdersByCategoryIdSize(@RequestParam Long id)
    {
        return orderService.getOrdersByCategoryIdLength(id);
    }

    @GetMapping("keySize")
    public long getOrdersByCategoryIdSize(@RequestParam String key)
    {
        return orderService.getOrderSizeByKey(key);
    }

    // http://localhost:8080/api/category/id
    /*@GetMapping("/api/category/{id}")
    public List<Order> getAllOrderByCategoryId(@PathVariable Long id){
        return orderService.getOrdersByIdCategories(id);
    }*/
}

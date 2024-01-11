package com.example.restaurant.controller;

import com.example.restaurant.dto.PurchaseRequest;
import com.example.restaurant.dto.PurchaseResponse;
import com.example.restaurant.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/buy/")
@CrossOrigin("http://localhost:4200" )
public class PurchaseController {
    private PurchaseService purchaseService;

    @Autowired
    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }


    // http://localhost:8080/api/buy/purchase
    @PostMapping("purchase")
    public PurchaseResponse addRequestOrder(@RequestBody PurchaseRequest purchaseRequest){
        System.out.println(purchaseRequest.getItems().size());
        return purchaseService.addRequestOrder(purchaseRequest);
    }
}

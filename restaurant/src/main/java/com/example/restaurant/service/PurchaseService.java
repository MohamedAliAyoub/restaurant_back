package com.example.restaurant.service;

import com.example.restaurant.dto.PurchaseRequest;
import com.example.restaurant.dto.PurchaseResponse;
import org.springframework.stereotype.Service;

@Service
public interface PurchaseService {
    public PurchaseResponse addRequestOrder(PurchaseRequest purchases);
}

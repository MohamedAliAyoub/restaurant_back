package com.example.restaurant.dto;

import com.example.restaurant.model.Address;
import com.example.restaurant.model.Client;
import com.example.restaurant.model.Item;
import com.example.restaurant.model.RequestOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRequest {

    private Client client;
    private RequestOrder requestOrder;
    private Set<Item> items;
    private Address fromAddress;
    private Address toAddress;
}

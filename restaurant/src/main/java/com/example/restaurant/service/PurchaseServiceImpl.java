package com.example.restaurant.service;

import com.example.restaurant.deo.ClientRepository;
import com.example.restaurant.dto.PurchaseRequest;
import com.example.restaurant.dto.PurchaseResponse;
import com.example.restaurant.model.Code;
import com.example.restaurant.model.Item;
import com.example.restaurant.model.RequestOrder;
import com.example.restaurant.util.UserCode;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Service
public class PurchaseServiceImpl implements PurchaseService{

    private ClientRepository clientRepository;


    @Autowired
    public PurchaseServiceImpl(ClientRepository clientRepository ) {
        this.clientRepository = clientRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse addRequestOrder(PurchaseRequest purchases) {
        /* #1 */
        RequestOrder requestOrder = purchases.getRequestOrder();
        /* #2 */
        String myCode = UserCode.getCode();
        requestOrder.setCode(myCode);

        /* #3 */
        List<Item> items = purchases.getItems();



        items.forEach(item -> requestOrder.addItem(item));

        /* #4 */
        requestOrder.setFromAddress(purchases.getFromAddress());
        requestOrder.setToAddress(purchases.getToAddress());

        /* #5 */
        purchases.getClient().addRequestOrder(requestOrder);

        clientRepository.save(purchases.getClient());

        return new PurchaseResponse(purchases.getClient().getName(),myCode);
    }

    private String getCode() {
        return UUID.randomUUID().toString();
    }



}

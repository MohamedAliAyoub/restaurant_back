package com.example.restaurant.service;

import com.example.restaurant.deo.ClientRepository;
import com.example.restaurant.dto.PurchaseRequest;
import com.example.restaurant.dto.PurchaseResponse;
import com.example.restaurant.model.RequestOrder;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Service
public class PurchaseServiceImpl implements PurchaseService{

    private ClientRepository clientRepository;

    @Autowired
    public PurchaseServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse addRequestOrder(PurchaseRequest purchases) {
        /* #1 */
        RequestOrder requestOrder = purchases.getRequestOrder();
        /* #2 */
        String myCode = getCode();
        requestOrder.setCode(myCode);

        /* #3 */
        requestOrder.setItems(purchases.getItems());
        purchases.getItems().forEach(item -> item.setRequestOrder(requestOrder));

        /* #4 */
        requestOrder.setFromAddress(purchases.getFromAddress());
        requestOrder.setToAddress(purchases.getToAddress());

        /* #5 */
        Set<RequestOrder> requestOrders = new HashSet<>();
        requestOrders.add(requestOrder);
        purchases.getClient().setRequestOrders(requestOrders);
        requestOrder.setClient(purchases.getClient());

        clientRepository.save(purchases.getClient());

        return new PurchaseResponse(purchases.getClient().getName(),myCode);
    }

    private String getCode() {
        return UUID.randomUUID().toString();
    }



}

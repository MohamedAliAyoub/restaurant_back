package com.example.restaurant.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "client")
public class Client extends PublicData{

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "client")
    private Set<RequestOrder> requestOrders = new HashSet<>();

    public void addRequestOrder(RequestOrder requestOrder){
        requestOrders.add(requestOrder);
        requestOrder.setClient(this);
    }

}

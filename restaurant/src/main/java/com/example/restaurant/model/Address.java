package com.example.restaurant.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address extends CategoryOrder {

    @Column(name = "country")
    private String country;

    @Column(name = "state")
    private String state;

    @Column(name = "zip_code")
    private String zipCode;

    @OneToOne
    @PrimaryKeyJoinColumn
    private RequestOrder requestOrder;
}
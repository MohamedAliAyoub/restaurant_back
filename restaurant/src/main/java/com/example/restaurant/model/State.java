package com.example.restaurant.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="state")
public class State extends PublicData{

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}

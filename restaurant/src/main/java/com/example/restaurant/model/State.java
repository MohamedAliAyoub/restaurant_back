package com.example.restaurant.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="state")
public class State extends PublicData{

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}

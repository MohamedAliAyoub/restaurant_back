package com.example.restaurant.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country extends PublicData {
    @Column(name = "code")
    private String code;
}

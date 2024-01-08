package com.example.restaurant.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class PublicData extends BaseEntity {
    @Column(name = "name")
    private String name;
}

package com.example.restaurant.model;

import jakarta.persistence.Column;

public class PublicData extends BaseEntity {
    @Column(name = "name")
    private String name;

}

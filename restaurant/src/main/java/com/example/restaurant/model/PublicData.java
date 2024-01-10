package com.example.restaurant.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public class PublicData extends CategoryOrder{
    @Column(name = "name")
    private String name;
}

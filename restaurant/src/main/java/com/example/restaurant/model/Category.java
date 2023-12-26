package com.example.restaurant.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Set;

@Data
@Entity
@Table(name = "category")
public class Category extends CategoryOrder{

    @OneToMany(mappedBy = "category")
    private Set<Order> orders;
}


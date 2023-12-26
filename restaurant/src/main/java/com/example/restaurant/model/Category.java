package com.example.restaurant.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Entity
@Table(name = "category")
public class Category extends CategoryOrder{

}


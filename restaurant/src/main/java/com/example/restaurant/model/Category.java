package com.example.restaurant.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "category")
public class Category extends PublicData{

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private Set<Order> orders;

    @Column(name = "logo")
    private String logo;

}


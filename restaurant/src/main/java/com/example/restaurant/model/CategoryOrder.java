package com.example.restaurant.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

// Id
// name
@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class CategoryOrder extends BaseEntity{


   @Column(name = "data_create")
    @CreationTimestamp
    private Date dateCreate;

    @Column(name = "data_update")
    @UpdateTimestamp
    private Date dateUpdate;
}

package com.example.restaurant.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_code")
public class Code extends BaseEntity {

    @Lob
    @Column(name = "code")
    private String Code;

    @OneToOne(mappedBy = "code")
    private User user;

}

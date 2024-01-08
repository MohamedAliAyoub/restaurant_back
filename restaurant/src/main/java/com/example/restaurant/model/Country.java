package com.example.restaurant.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Entity
@Table(name = "country")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country extends PublicData {
    @Column(name = "code")
    private String code;

    @OneToMany(mappedBy = "country")
    private Set<State> states;
}

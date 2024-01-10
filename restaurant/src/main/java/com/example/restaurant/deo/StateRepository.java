package com.example.restaurant.deo;

import com.example.restaurant.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StateRepository extends JpaRepository<State , Long> {

    public List<State> findByCountryCode(String Code);

}

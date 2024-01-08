package com.example.restaurant.deo;

import com.example.restaurant.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country , Long> {

}

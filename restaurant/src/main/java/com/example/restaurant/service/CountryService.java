package com.example.restaurant.service;

import com.example.restaurant.deo.CountryRepository;
import com.example.restaurant.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private CountryRepository countryRepository ;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getAllCountry()
    {
        return this.countryRepository.findAll();
    }
}

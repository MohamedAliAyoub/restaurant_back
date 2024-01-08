package com.example.restaurant.controller;

import com.example.restaurant.model.Country;
import com.example.restaurant.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
@CrossOrigin("http://localhost:4200" )

public class CountryController {
    private CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }
    @GetMapping("countries")

    public List<Country> getCountries()
    {
        return this.countryService.getAllCountry();
    }
}

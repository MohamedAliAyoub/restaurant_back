package com.example.restaurant.controller;

import com.example.restaurant.config.springSecurity.jwt.JwtAuthenticationFilter;
import com.example.restaurant.deo.JwtLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// http://localhost:8080
@RestController
@CrossOrigin("http://localhost:4200" )

// http://localhost:8080/
public class UserController {

    private final JwtAuthenticationFilter jwtAuthenticationFilter;

    @Autowired
    public UserController(JwtAuthenticationFilter jwtAuthenticationFilter) {
        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
    }

    // http://localhost:8080/login
    @PostMapping("/login")
    public String logIn(@RequestBody JwtLogin jwtLogin)
    {
        return jwtAuthenticationFilter.login(jwtLogin);
    }

}
package com.example.restaurant.controller;

import com.example.restaurant.service.JwtAuthenticationFilter;
import com.example.restaurant.deo.JwtLogin;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

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
    @PostMapping("/signin")
    public String logIn(@RequestBody JwtLogin jwtLogin)
    {
        return jwtAuthenticationFilter.login(jwtLogin);
    }

}
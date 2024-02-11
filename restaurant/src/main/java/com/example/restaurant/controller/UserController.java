package com.example.restaurant.controller;

import com.example.restaurant.config.springSecurity.jwt.JwtAuthorizationFilter;
import com.example.restaurant.dto.AccountResponse;
import com.example.restaurant.dto.LoginResponse;
import com.example.restaurant.model.User;
import com.example.restaurant.service.AuthoritiesService;
import com.example.restaurant.service.JwtAuthenticationFilter;
import com.example.restaurant.deo.JwtLogin;
import com.example.restaurant.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

// http://localhost:8080
@RestController
@CrossOrigin("http://localhost:4200" )

// http://localhost:8080/
public class UserController {

    private final JwtAuthenticationFilter jwtAuthenticationFilter;
    private UserService userService;
    private AuthoritiesService authoritiesService;
    private PasswordEncoder passwordEncoder;

    public UserController(JwtAuthenticationFilter jwtAuthenticationFilter, UserService userService, AuthoritiesService authoritiesService, PasswordEncoder passwordEncoder) {
        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
        this.userService = userService;
        this.authoritiesService = authoritiesService;
        this.passwordEncoder = passwordEncoder;
    }

    // http://localhost:8080/signin
    @PostMapping("/signin")
    public LoginResponse logIn(@RequestBody JwtLogin jwtLogin)
    {
        return jwtAuthenticationFilter.login(jwtLogin);
    }


    // http://localhost:8080/sigup
    @PostMapping("/signup")
    public AccountResponse createUser(@RequestBody JwtLogin jwtLogin){
        AccountResponse accountResponse = new AccountResponse();
        boolean result = userService.ifEmailExist(jwtLogin.getEmail());
        if(result){
            accountResponse.setResult(0);
        } else {
            User user = new User();
            user.setEmail(jwtLogin.getEmail());
            user.setPassword(passwordEncoder.encode(jwtLogin.getPassword()));
            user.setActive(1);
            user.getAuthorities().add(authoritiesService.getAuthorities().get(0));
            userService.addUser(user);
            accountResponse.setResult(1);
        }
        return accountResponse;
    }

}
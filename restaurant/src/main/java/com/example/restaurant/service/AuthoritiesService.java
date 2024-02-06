package com.example.restaurant.service;

import com.example.restaurant.deo.AuthoritiesRepository;
import com.example.restaurant.model.Authorities;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthoritiesService {
    private AuthoritiesRepository authoritiesRepository;

    @Autowired
    public AuthoritiesService(AuthoritiesRepository authoritiesRepository) {
        this.authoritiesRepository = authoritiesRepository;
    }

    @Transactional()
    public List<Authorities> getAuthorities(){
        return authoritiesRepository.findAll();
    }
}

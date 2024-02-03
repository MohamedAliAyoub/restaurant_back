package com.example.restaurant.db;

import com.example.restaurant.deo.AuthoritiesRepository;
import com.example.restaurant.deo.UserRepository;
import com.example.restaurant.model.Authorities;
import com.example.restaurant.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBService implements CommandLineRunner {
    private UserRepository userRepository;
    private AuthoritiesRepository authoritiesRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public DBService(UserRepository userRepository, AuthoritiesRepository authoritiesRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.authoritiesRepository = authoritiesRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
//        User user = new User();
//        user.setEmail("mohamedali1@gmail.com");
//        user.setPassword(passwordEncoder.encode("123456"));
//        user.setActive(1);
//        List<Authorities> authorities = authoritiesRepository.findAll();
//        user.getAuthorities().add(authorities.get(0));
//        user.getAuthorities().add(authorities.get(1));
//        userRepository.save(user);
    }
}

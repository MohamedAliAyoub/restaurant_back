package com.example.restaurant.service;

import com.example.restaurant.deo.UserRepository;
import com.example.restaurant.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

   public  UserRepository userRepository;
   @Autowired
    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        UserPrincipal userPrincipal = new UserPrincipal(user);
        System.out.println(user.getEmail() + "         " +user.getPassword());
        return userPrincipal;
    }

    @Transactional
    public void addUser(User user){
        userRepository.save(user);
    }
}

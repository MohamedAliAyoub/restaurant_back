package com.example.restaurant.deo;

import com.example.restaurant.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User , Long > {

    public User findByEmail(String email);
}

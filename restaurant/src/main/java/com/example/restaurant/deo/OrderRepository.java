package com.example.restaurant.deo;

import com.example.restaurant.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    public List<Order> findByCategoryId(Long id);
    public List<Order> findByNameContaining(String name);

}

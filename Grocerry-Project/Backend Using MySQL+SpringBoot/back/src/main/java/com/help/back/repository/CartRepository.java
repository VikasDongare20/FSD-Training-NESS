package com.help.back.repository;

import com.help.back.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CartRepository extends JpaRepository<Cart, Integer> {
}

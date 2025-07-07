package com.in.supplementStore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.supplementStore.Entities.CartItem;
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
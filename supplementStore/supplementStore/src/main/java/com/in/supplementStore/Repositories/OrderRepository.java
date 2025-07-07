package com.in.supplementStore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.supplementStore.Entities.Order;
public interface OrderRepository extends JpaRepository<Order, Long> {
}

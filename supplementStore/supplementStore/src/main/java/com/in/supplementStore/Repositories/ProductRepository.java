package com.in.supplementStore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.supplementStore.Entities.Product;
public interface ProductRepository extends JpaRepository<Product, Long> {
}
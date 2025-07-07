package com.in.supplementStore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.supplementStore.Entities.ProductVariant;


public interface ProductVariantRepository extends JpaRepository<ProductVariant, Long> {
}

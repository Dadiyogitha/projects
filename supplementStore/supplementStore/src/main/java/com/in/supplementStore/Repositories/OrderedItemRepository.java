package com.in.supplementStore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.supplementStore.Entities.OrderedItem;
public interface OrderedItemRepository extends JpaRepository<OrderedItem, Long> {
}

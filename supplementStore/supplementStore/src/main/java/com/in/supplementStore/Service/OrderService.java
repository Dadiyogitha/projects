package com.in.supplementStore.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.supplementStore.Entities.Order;
import com.in.supplementStore.Repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order placeOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getOrdersByUserId(Long userId) {
        List<Order> allOrders = orderRepository.findAll();
        List<Order> userOrders = new ArrayList<>();

        for (Order order : allOrders) {
            if (order.getUser() != null && order.getUser().getUserId().equals(userId)) {
                userOrders.add(order);
            }
        }

        return userOrders;
    }

    public Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public void updateOrderStatus(Long orderId, String status) {
        Order order = getOrderById(orderId);
        if (order != null) {
            order.setStatus(status);
            orderRepository.save(order);
        }
    }
}

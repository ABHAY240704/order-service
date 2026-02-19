package com.fintech.order_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrder(Order order) {
        // Business Rule: Ensure total amount is always positive
        if (order.getTotalAmount() <= 0) {
            throw new RuntimeException("Order amount must be greater than zero");
        }
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
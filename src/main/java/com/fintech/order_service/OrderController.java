package com.fintech.order_service;

import jakarta.validation.Valid; // New import for validation
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public Order placeOrder(@Valid @RequestBody Order order) { // Added @Valid here
        return orderService.saveOrder(order);
    }

    @GetMapping("/all")
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }
}
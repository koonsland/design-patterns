package com.koonsland.designpatterns.creational.singleton.service;

import com.koonsland.designpatterns.creational.singleton.bean.OrderManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderManager orderManager;

    // 생성자 주입
    public OrderService(OrderManager orderManager) {
        this.orderManager = orderManager;
    }

    public void placeOrder(String order) {
        orderManager.addOrder(order);
    }

    public List<String> getOrders() {
        return orderManager.getOrders();
    }
}

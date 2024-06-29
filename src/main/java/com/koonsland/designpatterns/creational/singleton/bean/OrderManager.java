package com.koonsland.designpatterns.creational.singleton.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private static OrderManager instance;
    private List<String> orders;

    private OrderManager() {
        orders = new ArrayList<>();
    }

    public static OrderManager getInstance() {
        if (instance == null) {
            synchronized (OrderManager.class) {
                if (instance == null) {
                    instance = new OrderManager();
                }
            }
        }
        return instance;
    }

    public void addOrder(String order) {
        orders.add(order);
    }

    public List<String> getOrders() {
        return orders;
    }
}

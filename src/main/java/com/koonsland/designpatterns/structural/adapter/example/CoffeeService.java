package com.koonsland.designpatterns.structural.adapter.example;

public class CoffeeService {
    public Coffee orderCoffee(String type, String temperature) {
        Coffee coffee = new Coffee(type, temperature);
        coffee.makeCoffee();
        return coffee;
    }
}

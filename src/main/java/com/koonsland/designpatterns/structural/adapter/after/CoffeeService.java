package com.koonsland.designpatterns.structural.adapter.after;

public class CoffeeService {
    public Coffee orderCoffee(String type, String temperature) {
        Coffee coffee = new Coffee(type, temperature);
        coffee.makeCoffee();
        return coffee;
    }
}

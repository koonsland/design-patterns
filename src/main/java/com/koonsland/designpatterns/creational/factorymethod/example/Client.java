package com.koonsland.designpatterns.creational.factorymethod.example;

public class Client {
    public static void main(String[] args) {
        Americano americano = CoffeeService.orderCoffee("GRANDE", "koonsland");
        System.out.println(americano);
    }
}

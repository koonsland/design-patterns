package com.koonsland.designpatterns.structural.adapter.example;

public class Client {
    public static void main(String[] args) {
        CoffeeService coffeeService = new CoffeeService();

        Coffee americano = coffeeService.orderCoffee("아메리카노", "ICED");
        System.out.println(americano);

        Coffee latte = coffeeService.orderCoffee("카페라떼", "ICED");
        System.out.println(latte);
    }
}

package com.koonsland.designpatterns.creational.factorymethod.after;


public class Client {
    public static void main(String[] args) {
        CoffeeService coffeeService = new CoffeeService();

        Coffee americano = coffeeService.orderCoffee("아메리카노", "REGULAR", "koonsland");
        System.out.println(americano);

        Coffee latte = coffeeService.orderCoffee("카페라떼", "LARGE", "koonsland");
        System.out.println(latte);
    }
}

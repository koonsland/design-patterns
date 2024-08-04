package com.koonsland.designpatterns.structural.adapter.after;

public class Client {
    public static void main(String[] args) {
        CoffeeService coffeeService = new CoffeeService();
        CoffeeMakerService coffeeMakerService = new DefaultCoffeeMakerService(coffeeService);

        CoffeeMaker coffeeMaker = coffeeMakerService.getCoffeeMaker("아메리카노", "ICED");
        coffeeMaker.brewCoffee();
        System.out.println(coffeeMaker.getCoffee());

        coffeeMaker = coffeeMakerService.getCoffeeMaker("카페라떼", "ICED");
        coffeeMaker.brewCoffee();
        System.out.println(coffeeMaker.getCoffee());
    }
}

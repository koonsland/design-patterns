package com.koonsland.designpatterns.structural.adapter.after;

public class DefaultCoffeeMakerService implements CoffeeMakerService {

    private final CoffeeService coffeeService;

    public DefaultCoffeeMakerService(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @Override
    public CoffeeMaker getCoffeeMaker(String type, String temperature) {
        Coffee coffee = coffeeService.orderCoffee(type, temperature);
        return new DefaultCoffeeMaker(coffee);
    }
}

package com.koonsland.designpatterns.structural.adapter.after;

public class DefaultCoffeeMaker implements CoffeeMaker {

    private final Coffee coffee;

    public DefaultCoffeeMaker(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getCoffeeType() {
        return coffee.getType();
    }

    @Override
    public String getTemperature() {
        return coffee.getTemperature();
    }

    @Override
    public boolean isComplete() {
        return coffee.isComplete();
    }

    @Override
    public void brewCoffee() {
        coffee.makeCoffee();
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}

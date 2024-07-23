package com.koonsland.designpatterns.creational.builder.after;

public class CoffeeDirector {

    private final CoffeeBuilder coffeeBuilder;

    public CoffeeDirector(CoffeeBuilder coffeeBuilder) {
        this.coffeeBuilder = coffeeBuilder;
    }

    public Coffee makeAmericano() {
        return coffeeBuilder
                .type("아메리카노")
                .size("TALL")
                .makeCoffee();
    }

    public Coffee makeVanillaLatte() {
        return coffeeBuilder.type("라떼")
                .size("GRANDE")
                .milk(true)
                .syrup("바닐라")
                .bean("아라비카")
                .temperature("HOT")
                .makeCoffee();
    }
}

package com.koonsland.designpatterns.creational.builder.after;

public class Client1 {
    public static void main(String[] args) {
        CoffeeBuilder coffeeBuilder = new BasicCoffeeBuilder();

        Coffee coffee = coffeeBuilder.type("아메리카노")
                .size("TALL")
                .makeCoffee();

        System.out.println(coffee);

        Coffee latte = coffeeBuilder.type("라떼")
                .size("GRANDE")
                .milk(true)
                .syrup("바닐라")
                .bean("아라비카")
                .temperature("HOT")
                .makeCoffee();

        System.out.println(latte);
    }
}

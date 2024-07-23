package com.koonsland.designpatterns.creational.builder.after;

public class Client2 {
    public static void main(String[] args) {
        CoffeeDirector coffeeDirector = new CoffeeDirector(new BasicCoffeeBuilder());
        Coffee coffee = coffeeDirector.makeAmericano();
        System.out.println(coffee);

        coffee = coffeeDirector.makeVanillaLatte();
        System.out.println(coffee);
    }
}

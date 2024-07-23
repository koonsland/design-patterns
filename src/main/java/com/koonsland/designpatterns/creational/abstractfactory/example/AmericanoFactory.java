package com.koonsland.designpatterns.creational.abstractfactory.example;

public class AmericanoFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        Coffee coffee = new Coffee();
        coffee.setBean(new Arabica());
        coffee.setSyrup(new Sugar());
        return coffee;
    }
}

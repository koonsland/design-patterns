package com.koonsland.designpatterns.creational.abstractfactory.after;

public class RobustaCoffeeBeanFactory implements CoffeeBeanFactory {
    @Override
    public CoffeeBean choiceBean() {
        return new Robusta();
    }
}

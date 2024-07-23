package com.koonsland.designpatterns.creational.abstractfactory.after;

public class ArabicaCoffeeBeanFactory implements CoffeeBeanFactory{
    @Override
    public CoffeeBean choiceBean() {
        return new Arabica();
    }
}

package com.koonsland.designpatterns.creational.abstractfactory.after;

public class AmericanoFactory implements CoffeeFactory {

    private final CoffeeBeanFactory coffeeBeanFactory;
    private final SyrupFactory syrupFactory;

    public AmericanoFactory(CoffeeBeanFactory coffeeBeanFactory, SyrupFactory syrupFactory) {
        this.coffeeBeanFactory = coffeeBeanFactory;
        this.syrupFactory = syrupFactory;
    }

    @Override
    public Coffee createCoffee() {
        Coffee coffee = new Coffee();
        coffee.setBean(coffeeBeanFactory.choiceBean());
        coffee.setSyrup(syrupFactory.choiceSyrup());
        return coffee;
    }
}

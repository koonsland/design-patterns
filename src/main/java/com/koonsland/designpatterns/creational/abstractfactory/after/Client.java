package com.koonsland.designpatterns.creational.abstractfactory.after;

public class Client {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new AmericanoFactory(new ArabicaCoffeeBeanFactory(), new SugarSyrupFactory());
        Coffee americano1 = coffeeFactory.createCoffee();
        System.out.println(americano1.getBean().getClass());
        System.out.println(americano1.getSyrup().getClass());

        coffeeFactory = new AmericanoFactory(new RobustaCoffeeBeanFactory(), new SugarSyrupFactory());
        Coffee americano2 = coffeeFactory.createCoffee();
        System.out.println(americano2.getBean().getClass());
        System.out.println(americano2.getSyrup().getClass());

        coffeeFactory = new AmericanoFactory(new RobustaCoffeeBeanFactory(), new VanillaSyrupFactory());
        Coffee americano3 = coffeeFactory.createCoffee();
        System.out.println(americano3.getBean().getClass());
        System.out.println(americano3.getSyrup().getClass());
    }
}

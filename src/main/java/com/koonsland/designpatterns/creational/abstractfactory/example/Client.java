package com.koonsland.designpatterns.creational.abstractfactory.example;

public class Client {
    public static void main(String[] args) {
        AmericanoFactory americanoFactory = new AmericanoFactory();
        Coffee coffee = americanoFactory.createCoffee();
        System.out.println(coffee.getBean().getClass());
        System.out.println(coffee.getSyrup().getClass());
    }
}

package com.koonsland.designpatterns.structural.bridge.after;

public class DefaultCoffee implements Coffee {

    private String name;
    private String temperature;
    private Espresso espresso;
    private Milk milk;

    public DefaultCoffee(String name, String temperature, Espresso espresso, Milk milk) {
        this.name = name;
        this.temperature = temperature;
        this.espresso = espresso;
        this.milk = milk;
    }

    @Override
    public String bean() {
        return this.espresso.getBean();
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String size() {
        return "TALL";
    }

    @Override
    public String temperature() {
        return this.temperature;
    }

    @Override
    public String toString() {
        return "DefaultCoffee{" + "name='" + name + '\'' + ", temperature='" + temperature + '\'' + ", espresso=" + espresso + ", milk=" + milk + '}';
    }
}

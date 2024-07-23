package com.koonsland.designpatterns.creational.builder.after;

public class BasicCoffeeBuilder implements CoffeeBuilder {

    private String type;
    private String bean;
    private String size;
    private boolean milk;
    private boolean sugar;
    private String syrup;
    private String temperature;

    @Override
    public CoffeeBuilder type(String type) {
        this.type = type;
        return this;
    }

    @Override
    public CoffeeBuilder bean(String bean) {
        this.bean = bean;
        return this;
    }

    @Override
    public CoffeeBuilder size(String size) {
        this.size = size;
        return this;
    }

    @Override
    public CoffeeBuilder milk(boolean milk) {
        this.milk = milk;
        return this;
    }

    @Override
    public CoffeeBuilder sugar(boolean sugar) {
        this.sugar = sugar;
        return this;
    }

    @Override
    public CoffeeBuilder syrup(String syrup) {
        this.syrup = syrup;
        return this;
    }

    @Override
    public CoffeeBuilder temperature(String temperature) {
        this.temperature = temperature;
        return this;
    }

    @Override
    public Coffee makeCoffee() {
        return new Coffee(type, bean, size, milk, sugar, syrup, temperature);
    }
}

package com.koonsland.designpatterns.creational.builder.after;


public interface CoffeeBuilder {

    CoffeeBuilder type(String type);
    CoffeeBuilder bean(String bean);
    CoffeeBuilder size(String size);
    CoffeeBuilder milk(boolean milk);
    CoffeeBuilder sugar(boolean sugar);
    CoffeeBuilder syrup(String syrup);
    CoffeeBuilder temperature(String temperature);
    Coffee makeCoffee();

}

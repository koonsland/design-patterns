package com.koonsland.designpatterns.structural.adapter.after;

public interface CoffeeMaker {
    String getCoffeeType();
    String getTemperature();
    boolean isComplete();
    void brewCoffee();
    Coffee getCoffee();
}

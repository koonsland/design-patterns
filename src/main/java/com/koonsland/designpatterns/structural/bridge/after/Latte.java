package com.koonsland.designpatterns.structural.bridge.after;

public class Latte extends DefaultCoffee {
    public Latte(String temperature, Espresso espresso, Milk milk) {
        super("카페라떼", temperature, espresso, getMilk(milk));
    }

    private static Milk getMilk(Milk milk) {
        return milk == null ? new Milk("일반") : milk;
    }
}

package com.koonsland.designpatterns.structural.bridge.after;

public class Americano extends DefaultCoffee {
    public Americano(String temperature, Espresso espresso) {
        super("아메리카노", temperature, espresso, null);
    }
}

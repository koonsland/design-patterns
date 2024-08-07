package com.koonsland.designpatterns.structural.bridge.after;

public class Client_1 {
    public static void main(String[] args) {
        Espresso espresso = new Espresso("아라비카", 1);
        Coffee americano = new DefaultCoffee("아메리카노", "ICED", espresso, null);
        System.out.println(americano);

        Milk milk = new Milk("우유");
        Coffee latte = new DefaultCoffee("카페라떼", "HOT", espresso, milk);
        System.out.println(latte);
    }
}

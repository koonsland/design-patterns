package com.koonsland.designpatterns.structural.bridge.after;

public class Client_2 {
    public static void main(String[] args) {
        Espresso espresso = new Espresso("아라비카", 1);
        Coffee americano = new Americano("ICED", espresso);
        System.out.println(americano);

        Espresso espressoShot2 = new Espresso("로부스타", 2);
        Milk milk = new Milk("두유");
        Latte latte = new Latte("HOT", espressoShot2, milk);
        System.out.println(latte);
    }
}

package com.koonsland.designpatterns.creational.builder.example;

public class Client {
    public static void main(String[] args) {
        Coffee americano = new Coffee("아메리카노", "TALL");
        System.out.println(americano);

        Coffee latte = new Coffee("카페라떼", "아라비카", "TALL", true, false, null, "HOT");
        System.out.println(latte);

    }
}

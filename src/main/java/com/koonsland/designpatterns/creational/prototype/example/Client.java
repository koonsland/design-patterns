package com.koonsland.designpatterns.creational.prototype.example;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("아메리카노", "아라비카", "TALL", false, null, "HOT");
        System.out.println(coffee);

        coffee = new Coffee("아메리카노", "아라비카", "TALL", false, null, "ICED");
        System.out.println(coffee);
    }
}

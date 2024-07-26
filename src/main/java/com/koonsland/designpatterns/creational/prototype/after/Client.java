package com.koonsland.designpatterns.creational.prototype.after;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Coffee coffee = new Coffee("아메리카노", "아라비카", "TALL", false, null, "HOT");
        System.out.println(coffee);

        Coffee clone = (Coffee) coffee.clone();
        clone.setTemperature("ICED");
        System.out.println(clone);
    }
}

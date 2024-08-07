package com.koonsland.designpatterns.structural.bridge.example;

public class Client {
    public static void main(String[] args) {
        Coffee icedAmericano = new IcedAmericano();
        System.out.println(icedAmericano);

        HotAmericano hotAmericano = new HotAmericano();
        System.out.println(hotAmericano);
    }
}

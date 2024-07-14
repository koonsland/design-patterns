package com.koonsland.designpatterns.creational.factorymethod.after;

public class CoffeeService implements CoffeeFactory{
    @Override
    public Coffee createCoffee(String type, String size) {
        if (type.equalsIgnoreCase("아메리카노")) {
            return new Americano(size);
        }

        if (type.equalsIgnoreCase("카페라떼")) {
            return new Latte(size);
        }

        throw new IllegalArgumentException("판매할 수 없는 커피 종류입니다.");
    }
}

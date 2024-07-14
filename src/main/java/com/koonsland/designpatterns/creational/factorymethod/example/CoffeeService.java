package com.koonsland.designpatterns.creational.factorymethod.example;

public class CoffeeService {
    public static Americano orderCoffee(String size, String nickname) {
        // validate
        if (size == null || size.isBlank()) {
            throw new IllegalArgumentException("사이즈를 선택해주세요");
        }

        if (nickname == null || nickname.isBlank()) {
            throw new IllegalArgumentException("주문자 닉네임을 입력해주세요");
        }

        // notify before
        notifyBefore(nickname);

        // make
        Americano americano = new Americano();
        americano.setSize(size);

        // notify after
        notifyAfter(nickname);

        return americano;
    }

    private static void notifyBefore(String nickname) {
        System.out.println(nickname + " 님, 주문하신 커피가 제조중입니다");
    }

    private static void notifyAfter(String nickname) {
        System.out.println(nickname + " 님, 주문하신 커피가 완성되었습니다");
    }
}

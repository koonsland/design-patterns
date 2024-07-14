package com.koonsland.designpatterns.creational.factorymethod.after;

public interface CoffeeFactory {
    default Coffee orderCoffee(String type, String size, String nickname) {
        // validate
        validate(type, size, nickname);

        // notify before
        notifyBefore(nickname);

        // make
        Coffee coffee = createCoffee(type, size);

        // notify after
        notifyAfter(nickname);

        return coffee;
    }

    Coffee createCoffee(String type, String size);

    private static void validate(String type, String size, String nickname) {
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("커피 종류를 선택해주세요");
        }

        if (size == null || size.isBlank()) {
            throw new IllegalArgumentException("사이즈를 선택해주세요");
        }

        if (nickname == null || nickname.isBlank()) {
            throw new IllegalArgumentException("주문자 닉네임을 입력해주세요");
        }
    }

    private static void notifyBefore(String nickname) {
        System.out.println(nickname + " 님, 주문하신 커피가 제조중입니다");
    }

    private static void notifyAfter(String nickname) {
        System.out.println(nickname + " 님, 주문하신 커피가 완성되었습니다");
    }
}

package com.koonsland.designpatterns.structural.bridge.example;

public class HotAmericano implements Coffee {
    @Override
    public String bean() {
        return "아라비카";
    }

    @Override
    public String name() {
        return "아메리카노";
    }

    @Override
    public String size() {
        return "TALL";
    }

    @Override
    public String temperature() {
        return "HOT";
    }

    public String toString() {
        return String.format("종류: %s, 원두: %s, 사이즈: %s, 온도: %s", name(), bean(), size(), temperature());
    }
}

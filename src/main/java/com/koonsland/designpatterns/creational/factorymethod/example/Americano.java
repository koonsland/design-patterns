package com.koonsland.designpatterns.creational.factorymethod.example;

public class Americano {
    private final String type = "아메리카노";
    private String size;

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Coffee{" + "type='" + type + '\'' + ", size='" + size + '\'' + '}';
    }
}

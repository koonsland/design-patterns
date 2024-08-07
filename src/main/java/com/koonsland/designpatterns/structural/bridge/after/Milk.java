package com.koonsland.designpatterns.structural.bridge.after;

public class Milk {
    private String type;

    public Milk(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Milk{" + "type='" + type + '\'' + '}';
    }
}

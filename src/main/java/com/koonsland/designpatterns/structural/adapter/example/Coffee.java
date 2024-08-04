package com.koonsland.designpatterns.structural.adapter.example;

public class Coffee {
    private String type;
    private String temperature;
    private boolean complete;

    public Coffee(String type, String temperature) {
        this.type = type;
        this.temperature = temperature;
        this.complete = false;
    }

    public String getType() {
        return type;
    }

    public String getTemperature() {
        return temperature;
    }

    public boolean isComplete() {
        return complete;
    }

    public void makeCoffee() {
        this.complete = true;
    }

    @Override
    public String toString() {
        return "Coffee{" + "type='" + type + '\'' + ", temperature='" + temperature + '\'' + ", complete=" + complete + '}';
    }
}

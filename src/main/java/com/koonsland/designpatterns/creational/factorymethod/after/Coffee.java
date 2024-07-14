package com.koonsland.designpatterns.creational.factorymethod.after;

public class Coffee {
    private String type;
    private String size;

    protected Coffee() {}

    protected Coffee(String type, String size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

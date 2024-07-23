package com.koonsland.designpatterns.creational.builder.after;

public class Coffee {
    private String type;
    private String bean;
    private String size;
    private boolean milk;
    private boolean sugar;
    private String syrup;
    private String temperature;

    public Coffee(String type, String size) {
        this.type = type;
        this.size = size;
    }

    public Coffee(String type, String bean, String size) {
        this(type, size);
        this.bean = bean;
    }

    public Coffee(String type, String bean, String size, boolean milk, boolean sugar, String syrup, String temperature) {
        this(type, bean, size);
        this.milk = milk;
        this.sugar = sugar;
        this.syrup = syrup;
        this.temperature = temperature;
    }

    public String getType() {
        return type;
    }

    public String getBean() {
        return bean;
    }

    public String getSize() {
        return size;
    }

    public boolean isMilk() {
        return milk;
    }

    public boolean isSugar() {
        return sugar;
    }

    public String getSyrup() {
        return syrup;
    }

    public String getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Coffee{" + "type='" + type + '\'' + ", bean='" + bean + '\'' + ", size='" + size + '\'' + ", milk=" + milk + ", sugar=" + sugar + ", syrup='" + syrup + '\'' + ", temperature='" + temperature + '\'' + '}';
    }
}

package com.koonsland.designpatterns.creational.prototype.after;

public class Coffee implements Cloneable{
    private String type;
    private String bean;
    private String size;
    private boolean milk;
    private String syrup;
    private String temperature;

    public Coffee(String type, String bean, String size, boolean milk, String syrup, String temperature) {
        this.type = type;
        this.bean = bean;
        this.size = size;
        this.milk = milk;
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

    public String getSyrup() {
        return syrup;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Coffee{" + "type='" + type + '\'' + ", bean='" + bean + '\'' + ", size='" + size + '\'' + ", milk=" + milk + ", syrup='" + syrup + '\'' + ", temperature='" + temperature + '\'' + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

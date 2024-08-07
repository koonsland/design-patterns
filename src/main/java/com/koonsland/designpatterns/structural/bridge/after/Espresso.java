package com.koonsland.designpatterns.structural.bridge.after;

public class Espresso {
    private String bean;
    private Integer shot;

    public Espresso(String bean, Integer shot) {
        this.bean = bean;
        this.shot = shot;
    }

    public String getBean() {
        return bean;
    }

    public Integer getShot() {
        return shot;
    }

    @Override
    public String toString() {
        return "Espresso{" + "bean='" + bean + '\'' + ", shot=" + shot + '}';
    }
}

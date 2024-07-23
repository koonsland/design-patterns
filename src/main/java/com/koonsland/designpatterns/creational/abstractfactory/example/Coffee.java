package com.koonsland.designpatterns.creational.abstractfactory.example;

public class Coffee {

    private Arabica bean;
    private Sugar syrup;

    public Arabica getBean() {
        return bean;
    }

    public void setBean(Arabica bean) {
        this.bean = bean;
    }

    public Sugar getSyrup() {
        return syrup;
    }

    public void setSyrup(Sugar syrup) {
        this.syrup = syrup;
    }
}

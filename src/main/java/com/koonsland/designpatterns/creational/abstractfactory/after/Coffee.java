package com.koonsland.designpatterns.creational.abstractfactory.after;

public class Coffee {
    private CoffeeBean bean;
    private Syrup syrup;

    public CoffeeBean getBean() {
        return bean;
    }

    public void setBean(CoffeeBean bean) {
        this.bean = bean;
    }

    public Syrup getSyrup() {
        return syrup;
    }

    public void setSyrup(Syrup syrup) {
        this.syrup = syrup;
    }
}

package com.koonsland.designpatterns.creational.abstractfactory.after;

public class VanillaSyrupFactory implements SyrupFactory{
    @Override
    public Syrup choiceSyrup() {
        return new Vanilla();
    }
}

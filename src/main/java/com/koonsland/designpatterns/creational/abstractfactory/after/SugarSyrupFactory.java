package com.koonsland.designpatterns.creational.abstractfactory.after;

public class SugarSyrupFactory implements SyrupFactory{
    @Override
    public Syrup choiceSyrup() {
        return new Sugar();
    }
}

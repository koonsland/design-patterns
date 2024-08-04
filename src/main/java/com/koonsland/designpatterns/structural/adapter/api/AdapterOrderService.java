package com.koonsland.designpatterns.structural.adapter.api;

import com.koonsland.designpatterns.structural.adapter.after.Coffee;
import com.koonsland.designpatterns.structural.adapter.after.CoffeeMaker;
import com.koonsland.designpatterns.structural.adapter.after.CoffeeMakerService;
import org.springframework.stereotype.Service;

@Service
public class AdapterOrderService {
    private final CoffeeMakerService coffeeMakerService;

    public AdapterOrderService(CoffeeMakerService coffeeMakerService) {
        this.coffeeMakerService = coffeeMakerService;
    }

    public Coffee orderCoffee(String type, String temperature) {
        CoffeeMaker coffeeMaker = coffeeMakerService.getCoffeeMaker(type, temperature);
        coffeeMaker.brewCoffee();

        return coffeeMaker.getCoffee();
    }
}

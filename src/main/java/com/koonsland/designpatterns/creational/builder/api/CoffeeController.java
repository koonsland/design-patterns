package com.koonsland.designpatterns.creational.builder.api;

import com.koonsland.designpatterns.creational.builder.after.BasicCoffeeBuilder;
import com.koonsland.designpatterns.creational.builder.after.Coffee;
import com.koonsland.designpatterns.creational.builder.after.CoffeeBuilder;
import com.koonsland.designpatterns.creational.builder.after.CoffeeDirector;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/creational/builder")
public class CoffeeController {

    private final CoffeeDirector coffeeDirector;

    public CoffeeController(CoffeeDirector coffeeDirector) {
        this.coffeeDirector = coffeeDirector;
    }

    @PostMapping("/orders")
    public Coffee orderCoffee(@RequestBody CoffeeRequest request) {
        CoffeeBuilder coffeeBuilder = new BasicCoffeeBuilder();

        return coffeeBuilder
                .type(request.type())
                .size(request.size())
                .milk(request.milk())
                .sugar(request.sugar())
                .makeCoffee();
    }

    @PostMapping("/orders/americano")
    public Coffee orderAmericano() {
        return coffeeDirector.makeAmericano();
    }
}

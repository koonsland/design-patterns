package com.koonsland.designpatterns.structural.adapter.api;

import com.koonsland.designpatterns.structural.adapter.after.CoffeeMakerService;
import com.koonsland.designpatterns.structural.adapter.after.CoffeeService;
import com.koonsland.designpatterns.structural.adapter.after.DefaultCoffeeMakerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdapterConfig {

    @Bean
    CoffeeMakerService coffeeMakerService() {
        return new DefaultCoffeeMakerService(new CoffeeService());
    }
}

package com.koonsland.designpatterns.creational.builder.api;

import com.koonsland.designpatterns.creational.builder.after.BasicCoffeeBuilder;
import com.koonsland.designpatterns.creational.builder.after.CoffeeBuilder;
import com.koonsland.designpatterns.creational.builder.after.CoffeeDirector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoffeeConfig {

    @Bean
    public CoffeeBuilder coffeeBuilder() {
        return new BasicCoffeeBuilder();
    }

    @Bean
    public CoffeeDirector coffeeDirector() {
        return new CoffeeDirector(coffeeBuilder());
    }
}

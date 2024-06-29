package com.koonsland.designpatterns.creational.singleton.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public OrderManager orderManager() {
        return OrderManager.getInstance();
    }
}

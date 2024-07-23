package com.koonsland.designpatterns.creational.builder.api;

public record CoffeeRequest (
    String type,
    String bean,
    String size,
    boolean milk,
    boolean sugar,
    String syrup,
    String temperature
){ }

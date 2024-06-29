package com.koonsland.designpatterns.creational.singleton.dto;

public class OrderDto {
    private String name;

    public OrderDto() {}

    public OrderDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

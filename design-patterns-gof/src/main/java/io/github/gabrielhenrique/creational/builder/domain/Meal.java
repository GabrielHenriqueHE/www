package io.github.gabrielhenrique.creational.builder.domain;

import io.github.gabrielhenrique.creational.builder.interfaces.MealCompositeContract;

public class Meal implements MealCompositeContract {

    private String name;
    private Double price;

    public Meal(String name, Double  price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}

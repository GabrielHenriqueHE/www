package io.github.gabrielhenrique.creational.builder.domain;

import io.github.gabrielhenrique.creational.builder.interfaces.MealCompositeContract;

import java.util.ArrayList;
import java.util.List;

public class MealBox implements MealCompositeContract {
    private final List<MealCompositeContract> children = new ArrayList<>();

    @Override
    public Double getPrice() {
        Double price = 0.0;

        for (MealCompositeContract meal : children) {
            price += meal.getPrice();
        }

        return price;
    }

    public MealBox add(MealCompositeContract meal) {
        this.children.add(meal);
        return this;
    }
}

package io.github.gabrielhenrique.creational.builder;

import io.github.gabrielhenrique.creational.builder.builders.MainDishBuilder;
import io.github.gabrielhenrique.creational.builder.domain.MealBox;

public class Main {
    public static void main(String[] args) {
        MainDishBuilder mainDishBuilder = new MainDishBuilder();
        MealBox mealBox = mainDishBuilder.makeMeal().makeBeverage().build();

        System.out.println(mealBox.getPrice());

        mainDishBuilder.reset();

        System.out.println(mainDishBuilder.build().getPrice());
    }
}

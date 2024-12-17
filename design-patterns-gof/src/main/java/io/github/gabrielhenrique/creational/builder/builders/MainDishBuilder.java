package io.github.gabrielhenrique.creational.builder.builders;

import io.github.gabrielhenrique.creational.builder.domain.Meal;
import io.github.gabrielhenrique.creational.builder.domain.MealBox;
import io.github.gabrielhenrique.creational.builder.domain.Menu;
import io.github.gabrielhenrique.creational.builder.interfaces.MealBuilderContract;

public class MainDishBuilder implements MealBuilderContract {

    private MealBox meal = new MealBox();

    @Override
    public MainDishBuilder makeMeal() {
        this.meal.add(Menu.RICE);
        this.meal.add(Menu.BEANS);
        this.meal.add(Menu.MEAT);

        return this;
    }

    public MainDishBuilder makeBeverage() {
        this.meal.add(Menu.BEVERAGE);

        return this;
    }

    public MainDishBuilder makeDessert() {
        this.meal.add(Menu.DESSERT);

        return this;
    }

    public MealBox build() {
        return this.meal;
    }

    public MainDishBuilder reset() {
        this.meal = new MealBox();

        return this;
    }
}

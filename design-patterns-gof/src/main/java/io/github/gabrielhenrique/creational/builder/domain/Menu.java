package io.github.gabrielhenrique.creational.builder.domain;

public abstract class Menu {
    public static final Meal RICE = new Meal("Rice", 5.00);
    public static final Meal BEANS = new Meal("Beans", 10.00);
    public static final Meal MEAT = new Meal("Meat", 20.00);
    public static final Beverage BEVERAGE = new Beverage("Beverage", 7.00);
    public static final Dessert DESSERT = new Dessert("Dessert", 10.00);
}

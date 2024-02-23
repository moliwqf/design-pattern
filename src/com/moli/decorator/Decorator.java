package com.moli.decorator;

/**
 * @author moli
 * @time 2024-02-23 09:22:20
 * @description 装饰者
 */
public class Decorator extends Drink{

    private final Drink drink;

    public Decorator(String des, float price, Drink drink) {
        super(des, price);
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.getPrice();
    }
}

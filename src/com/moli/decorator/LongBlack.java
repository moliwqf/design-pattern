package com.moli.decorator;

/**
 * @author moli
 * @time 2024-02-23 09:19:49
 * @description long black
 */
public class LongBlack extends Drink {

    public LongBlack(String des, float price) {
        super(des, price);
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}

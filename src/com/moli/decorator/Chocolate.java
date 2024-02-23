package com.moli.decorator;

/**
 * @author moli
 * @time 2024-02-23 09:24:17
 * @description 巧克力
 */
public class Chocolate extends Decorator{

    public Chocolate(String des, float price, Drink drink) {
        super(des, price, drink);
    }

}

package com.moli.decorator;

/**
 * @author moli
 * @time 2024-02-23 09:15:36
 * @description 装饰者模式
 */
public class DecoratorPattern {

    public static void main(String[] args) {
        Drink drink = new LongBlack("黑巴咖啡", 10.0f);
        System.out.println(drink.cost());
        drink = new Chocolate("巧克力", 10.0f, drink);
        System.out.println(drink.cost());
    }
}

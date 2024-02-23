package com.moli.templatemethod;

/**
 * @author moli
 * @time 2024-02-23 15:56:20
 * @description 模板类
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("boilWater");
    }

    void pourInCup() {
        System.out.println("boilWater");
    }
}

package com.moli.templatemethod;

/**
 * @author moli
 * @time 2024-02-23 15:58:33
 * @description 具体的执行
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("coffee.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("coffee.addCondiments");
    }
}

package com.moli.templatemethod;

/**
 * @author moli
 * @time 2024-02-23 15:59:30
 * @description 茶
 */
public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Tea.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.addCondiments");
    }
}

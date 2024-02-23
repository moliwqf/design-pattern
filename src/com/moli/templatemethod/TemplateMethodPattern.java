package com.moli.templatemethod;

/**
 * @author moli
 * @time 2024-02-23 15:11:18
 * @description 魔板方法模式
 */
public class TemplateMethodPattern {

    public static void main(String[] args) {

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        coffee = new Tea();
        coffee.prepareRecipe();
    }
}

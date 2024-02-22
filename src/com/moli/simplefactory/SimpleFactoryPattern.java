package com.moli.simplefactory;

import com.moli.simplefactory.simplefactory.SimpleFactoryBean;
import com.moli.simplefactory.simpleimpl.CheesePizza;
import com.moli.simplefactory.simpleimpl.Pizza;

/**
 * @author moli
 * @time 2024-02-22 15:54:52
 * @description 简单工厂模式
 */
public class SimpleFactoryPattern {

    public static void main(String[] args) {
        /*
            具体需求：披萨项目。 可以有很对的pizza类型
         */
        // 简单实现 -- 直接在client端进行 if - else 判断
        Pizza pizza = null;
        int pizzaType = 0;
        //noinspection ConstantValue
        if (pizzaType == 0) {
            pizza = new CheesePizza();
        }
        //noinspection ConstantValue
        if (pizza != null) {
            pizza.prepare();
        }
        // 简单工厂实现 - 将创建对象的任务交给工厂实现，我们只需要给出对应的bean类型就行，由工厂来决定创建哪个对象。
        SimpleFactoryBean factory = new SimpleFactoryBean();
        Pizza pizza1 = factory.createPizza(0);
        if (pizza1 != null) {
            pizza1.prepare();
        }
    }
}

package com.moli.simplefactory.simplefactory;

import com.moli.simplefactory.simpleimpl.CheesePizza;
import com.moli.simplefactory.simpleimpl.Pizza;

/**
 * @author moli
 * @time 2024-02-22 16:08:46
 * @description 简单工厂bean
 */
public class SimpleFactoryBean {

    public Pizza createPizza(int pizzaType) {
        if (pizzaType == 0) {
            return new CheesePizza();
        }
        // ...
        return null;
    }
}

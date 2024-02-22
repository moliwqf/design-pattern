package com.moli.abstractfactory;

/**
 * @author moli
 * @time 2024-02-22 16:42:25
 * @description 其中一个工厂
 */
public class Product1Factory1 extends AbstractFactory {
    @Override
    public Product createProduct(int type) {
        if (type == 0) {
            return new Product1();
        }
        // ...
        return null;
    }
}

package com.moli.abstractfactory;

/**
 * @author moli
 * @time 2024-02-22 16:46:52
 * @description 其中一个工厂实现
 */
public class ProductFactory2 extends AbstractFactory{
    @Override
    public Product createProduct(int type) {
        if (type == 0) {
            return new Product2();
        }
        // ...
        return null;
    }
}

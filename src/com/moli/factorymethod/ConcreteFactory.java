package com.moli.factorymethod;

/**
 * @author moli
 * @time 2024-02-22 16:31:14
 * @description 具体的工厂实现
 */
public class ConcreteFactory extends Factory{

    @Override
    public Product createProduct() {
        return new Product();
    }

}

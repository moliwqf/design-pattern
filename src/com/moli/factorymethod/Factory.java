package com.moli.factorymethod;

/**
 * @author moli
 * @time 2024-02-22 16:29:46
 * @description 抽象工厂，将创建对象的方法交给子类实现，并在工厂中加入对创建的对象的操作。
 */
public abstract class Factory {

    public abstract Product createProduct();

    public void doSomething() {
        Product product = createProduct();
        product.doSomething();
        // ...
    }
}

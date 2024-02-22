package com.moli.simplefactory.simpleimpl;

/**
 * @author moli
 * @time 2024-02-22 16:00:02
 * @description 具体类
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare");
    }
}

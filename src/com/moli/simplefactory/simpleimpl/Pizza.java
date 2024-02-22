package com.moli.simplefactory.simpleimpl;

/**
 * @author moli
 * @time 2024-02-22 15:58:54
 * @description 抽象类
 */
public abstract class Pizza {

    public abstract void prepare();

    public void bake() {
        System.out.println("bake");
    }
}

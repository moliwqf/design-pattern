package com.moli.bridge;

/**
 * @author moli
 * @time 2024-02-22 22:07:30
 * @description 手机
 */
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public abstract void open();

    public abstract void off();

    public abstract void call();
}

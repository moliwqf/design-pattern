package com.moli.bridge;

/**
 * @author moli
 * @time 2024-02-22 22:08:56
 * @description 折叠手机
 */
public class ZhediePhone extends Phone{

    public ZhediePhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        // brand doSomething
        System.out.println("开机");
    }

    @Override
    public void off() {
        System.out.println("关机");
    }

    @Override
    public void call() {
        System.out.println("打电话");
    }
}

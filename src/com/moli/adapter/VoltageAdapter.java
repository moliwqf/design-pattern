package com.moli.adapter;

/**
 * @author moli
 * @time 2024-02-22 21:08:31
 * @description 电源适配器
 */
public class VoltageAdapter implements Voltage220, Voltage5 {

    @Override
    public void output200v() {
        System.out.println("output200v");
    }

    @Override
    public void output5v() {
        output200v();
        // 转化
        System.out.println("output5v");
    }
}

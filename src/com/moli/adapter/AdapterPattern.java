package com.moli.adapter;

/**
 * @author moli
 * @time 2024-02-22 21:05:39
 * @description 适配器模式
 */
public class AdapterPattern {

    public static void main(String[] args) {
        VoltageAdapter adapter = new VoltageAdapter();
        new Phone().charging(adapter);
    }
}

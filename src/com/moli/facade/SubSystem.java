package com.moli.facade;

/**
 * @author moli
 * @time 2024-02-23 13:15:10
 * @description 子系统 可以有多个
 */
public class SubSystem {

    public void on() {
        System.out.println("on");
    }
    public void run() {
        System.out.println("run");
    }
    public void off() {
        System.out.println("off");
    }
}

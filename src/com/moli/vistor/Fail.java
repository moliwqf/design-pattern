package com.moli.vistor;

/**
 * @author moli
 * @time 2024-02-23 16:54:36
 * @description 失败
 */
public class Fail extends Action{
    @Override
    public void operation1(Person person) {
        System.out.println("Fail.operation1");
    }

    @Override
    public void operation2(Person person) {
        System.out.println("Fail.operation2");
    }
}

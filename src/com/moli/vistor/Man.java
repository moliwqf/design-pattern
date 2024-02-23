package com.moli.vistor;

/**
 * @author moli
 * @time 2024-02-23 16:54:15
 * @description 男人
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        System.out.println("Man.accept");
        action.operation1(this);
    }
}

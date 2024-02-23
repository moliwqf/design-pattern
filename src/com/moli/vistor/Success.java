package com.moli.vistor;

/**
 * @author moli
 * @time 2024-02-23 16:52:31
 * @description 成功
 */
public class Success extends Action {
    @Override
    public void operation1(Person person) {
        System.out.println("Success.operation1");
    }

    @Override
    public void operation2(Person person) {
        System.out.println("Success.operation2");
    }
}

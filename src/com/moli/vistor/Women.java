package com.moli.vistor;

/**
 * @author moli
 * @time 2024-02-23 16:54:24
 * @description 女人
 */
public class Women extends Person{
    @Override
    public void accept(Action action) {
        System.out.println("Women.accept");
        action.operation2(this);
    }
}

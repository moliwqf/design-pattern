package com.moli.singleton;

/**
 * @author moli
 * @time 2024-02-22 15:15:10
 * @description 单例设计模式
 */
public class SingletonPattern {

    public static void main(String[] args) {
        System.out.println(BeanHungry.getBean());
        /*
            在jdk中，java.lang.Runtime就是经典的单例模式
         */
        Runtime runtime = Runtime.getRuntime();
    }
}

package com.moli.facade;

/**
 * @author moli
 * @time 2024-02-23 10:47:03
 * @description 外观模式
 */
public class FacadePattern {

    public static void main(String[] args) {

        /*
            1. facade模式：提供一个统一接口来对多个接口进行控制管理，让子系统更容易使用
            2. Mybatis - Configuration 使用外观模式
         */
        Facade facade = new Facade();
        facade.run();
        facade.off();
    }
}

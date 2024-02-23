package com.moli.facade;

/**
 * @author moli
 * @time 2024-02-23 13:16:06
 * @description 外观类
 */
public class Facade {

    // 将所有的子系统组合进来
    private final SubSystem subSystem = new SubSystem();

    public void run() {
        subSystem.on();
        subSystem.run();
    }
    public void off() {
        subSystem.off();
    }
}

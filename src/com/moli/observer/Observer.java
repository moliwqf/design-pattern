package com.moli.observer;

/**
 * @author moli
 * @time 2024-02-23 19:18:42
 * @description 观察者，需求天气方
 */
public interface Observer {

    void update(float temperature, float pressure, float humidity);

}

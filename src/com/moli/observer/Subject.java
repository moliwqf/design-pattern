package com.moli.observer;

/**
 * @author moli
 * @time 2024-02-23 19:17:59
 * @description 管理天气接口
 */
public interface Subject {

    void register(Observer observer);

    void remove(Observer observer);

    void notifyObs();

}

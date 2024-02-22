package com.moli.singleton;

/**
 * @author moli
 * @time 2024-02-22 15:44:32
 * @description 枚举实现单例模式
 */
/*
    借助了jdk1.5添加的枚举进行实现，不仅避免了线程安全的问题，而且还能防止反序列化重新创建新对象。
 */
public enum BeanEnum {
    INSTANCE;
}

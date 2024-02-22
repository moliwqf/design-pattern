package com.moli.builder;

/**
 * @author moli
 * @time 2024-02-22 20:29:55
 * @description 抽象构建
 */
public abstract class AbstractBuilder {

    private final House house;

    public abstract void partA();

    public abstract void partB();

    public abstract void partC();

    public House build() {
        return house;
    }

    public AbstractBuilder(House house) {
        this.house = house;
    }
}

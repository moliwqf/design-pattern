package com.moli.builder;

/**
 * @author moli
 * @time 2024-02-22 20:31:25
 * @description 房子建造者
 */
public class HouseBuilder extends AbstractBuilder {

    public HouseBuilder(House house) {
        super(house);
    }

    @Override
    public void partA() {
        System.out.println("do A");
    }

    @Override
    public void partB() {
        System.out.println("do B");
    }

    @Override
    public void partC() {
        System.out.println("do C");
    }
}

package com.moli.builder;

/**
 * @author moli
 * @time 2024-02-22 20:29:23
 * @description 建造者模式
 */
public class BuilderPattern {

    public static void main(String[] args) {
        construct();
    }

    public static void construct() {
        AbstractBuilder builder = new HouseBuilder(new House());
        // 将构建流程交给指挥者
        builder.partB();
        builder.partA();
        builder.partC();
        // 返回最后结果
        builder.build();
    }
}

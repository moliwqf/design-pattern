package com.moli.flyweight;

/**
 * @author moli
 * @time 2024-02-23 13:40:38
 * @description 具体网站类型
 */
public class ConcreteWebsite extends Website {

    private final String type;

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("type:" + type);
    }
}

package com.moli.composite;

/**
 * @author moli
 * @time 2024-02-23 09:48:26
 * @description 组件
 */
public abstract class Component {

    private String name;

    public Component(String name) {
        this.name = name;
    }

    public void print() {
        print(0);
    }

    public abstract void add(Component component);

    public abstract void print(int level);

    public abstract void remove(Component component);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

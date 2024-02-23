package com.moli.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author moli
 * @time 2024-02-23 09:50:23
 * @description 组合
 */
public class Composite extends Component{

    private final List<Component> child = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        child.add(component);
    }

    @Override
    public void print(int level) {
        for (Component component : child) {
            System.out.println(component);
        }
    }

    @Override
    public void remove(Component component) {
        if (child.isEmpty()) return;
        child.remove(component);
    }
}

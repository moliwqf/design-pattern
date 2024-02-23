package com.moli.composite;

/**
 * @author moli
 * @time 2024-02-23 09:53:25
 * @description 叶子结点
 */
public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        throw new RuntimeException();
    }

    @Override
    public void print(int level) {
        System.out.println("leaf:" + getName());
    }

    @Override
    public void remove(Component component) {
        throw new RuntimeException();
    }
}

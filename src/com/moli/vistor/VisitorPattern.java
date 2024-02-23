package com.moli.vistor;

/**
 * @author moli
 * @time 2024-02-23 16:50:35
 * @description 访问者模式
 */
public class VisitorPattern {

    public static void main(String[] args) {

        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Women());

        structure.display();
    }
}

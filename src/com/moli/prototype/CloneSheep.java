package com.moli.prototype;

/**
 * @author moli
 * @time 2024-02-22 17:11:31
 * @description 克隆羊
 */
public class CloneSheep extends Sheep{

    private final String name;

    public CloneSheep(String name) {
        this.name = name;
    }

    @Override
    public Sheep myClone() {
        return new CloneSheep(name);
    }

}

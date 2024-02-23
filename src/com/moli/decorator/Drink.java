package com.moli.decorator;

/**
 * @author moli
 * @time 2024-02-23 09:19:34
 * @description 饮料
 */
public abstract class Drink {

    private String des;

    private float price = 0.0f;

    public Drink(String des, float price) {
        this.des = des;
        this.price = price;
    }

    public abstract float cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

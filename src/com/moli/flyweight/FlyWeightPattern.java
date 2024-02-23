package com.moli.flyweight;

/**
 * @author moli
 * @time 2024-02-23 13:32:23
 * @description 享元模式
 */
public class FlyWeightPattern {

    public static void main(String[] args) {

        WebsiteFactory fa = new WebsiteFactory();
        Website blog = fa.getWebsite("blog");
        blog.use();
        Website app = fa.getWebsite("app");
        app.use();
    }
}

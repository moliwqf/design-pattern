package com.moli.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author moli
 * @time 2024-02-23 13:41:55
 * @description 网站工厂
 */
public class WebsiteFactory {

    private final Map<String, Website> websites = new HashMap<>();

    public Website getWebsite(String type) {
        if (!websites.containsKey(type)) websites.put(type, new ConcreteWebsite(type));
        return websites.get(type);
    }
}

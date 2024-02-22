package com.moli.singleton;

/**
 * @author moli
 * @time 2024-02-22 15:15:58
 * @description 单例实例 - 饿汉式
 */

public class BeanHungry {

    // 1. 构造器私有化
    private BeanHungry() {
    }

    // 2. 类的内部创建实例供给外部使用
    private static final BeanHungry INSTANCE = new BeanHungry();

    // 3. 公共返回外部
    public static BeanHungry getBean() {
        return INSTANCE;
    }
}

class BeanHungryStatic {

    // 1. 构造器私有化
    private BeanHungryStatic() {
    }

    // 2. 类的内部创建实例供给外部使用
    private static final BeanHungryStatic INSTANCE;

    static {
        INSTANCE = new BeanHungryStatic();
    }

    // 3. 公共返回外部
    public static BeanHungryStatic getBean() {
        return INSTANCE;
    }
}

class BeanHungryStaticOuter {

    // 1. 构造器私有化
    private BeanHungryStaticOuter() {
    }

    private static class BeanHungryStaticInner {
        private static BeanHungryStaticInner INSTANCE = new BeanHungryStaticInner();
    }

    // 2. 类的内部创建实例供给外部使用
    private static final BeanHungryStaticOuter INSTANCE;

    static {
        INSTANCE = new BeanHungryStaticOuter();
    }

    // 3. 公共返回外部
    public static BeanHungryStaticOuter getBean() {
        return INSTANCE;
    }

    public static BeanHungryStaticInner getInnerBean() {
        return BeanHungryStaticInner.INSTANCE;
    }
}


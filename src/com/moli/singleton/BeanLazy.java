package com.moli.singleton;

/**
 * @author moli
 * @time 2024-02-22 15:20:46
 * @description 懒汉式
 */
public class BeanLazy {

    // 1. 构造器私有化
    private BeanLazy() {
    }

    // 2. 类的内部创建实例供给外部使用
    private static BeanLazy INSTANCE;

    // 3. 公共返回外部
    public static synchronized BeanLazy getBean() {
        if (INSTANCE == null) {
            INSTANCE = new BeanLazy();
        }
        return INSTANCE;
    }
}

/**
 * 双重检查，解决了线程安全，并且解决了效率问题。
 */
class BeanLazyElse {

    // 1. 构造器私有化
    private BeanLazyElse() {
    }

    // 2. 类的内部创建实例供给外部使用
    private volatile static BeanLazyElse INSTANCE;

    // 3. 公共返回外部
    public static BeanLazyElse getBean() {
        if (INSTANCE == null) {
            synchronized (BeanLazyElse.class) {
                if (INSTANCE == null) {
                    INSTANCE = new BeanLazyElse();
                }
            }
        }
        return INSTANCE;
    }
}

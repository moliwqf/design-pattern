package com.moli.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author moli
 * @time 2024-02-23 14:28:36
 * @description 动态代理工厂
 */
public class ProxyFactory {

    private final Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        /*
         * 1. 目标对象类加载器
         * 2. 目标对象实现的所有接口
         * 3. 调用方法处理器，执行接口中的某个方法使用。
         *  3.1 proxy 动态生成的代理对象
         *  3.2 调用的目标方法
         *  3.3 方法参数
         */
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, params) -> {
                    System.out.println("jdk 代理开始");
                    Object ret = method.invoke(target, params);
                    System.out.println("代理结束..");
                    return ret;
                }
        );
    }

}

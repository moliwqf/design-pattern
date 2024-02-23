package com.moli.proxy;

import com.moli.proxy.dynamicproxy.ProxyFactory;
import com.moli.proxy.staticproxy.ITeacherService;
import com.moli.proxy.staticproxy.TeacherProxy;
import com.moli.proxy.staticproxy.TeacherServiceImpl;

/**
 * @author moli
 * @time 2024-02-23 14:13:31
 * @description 代理模式
 */
public class ProxyPattern {

    public static void main(String[] args) {
        // 静态代理
        ITeacherService service = new TeacherServiceImpl();
        ITeacherService proxy = new TeacherProxy(service);
        proxy.teach();
        // 动态代理 - JDK代理、接口代理
        ProxyFactory proxyFactory = new ProxyFactory(service);
        ITeacherService instance = (ITeacherService) proxyFactory.getProxyInstance();
        instance.teach();
    }
}

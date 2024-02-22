package com.moli.bridge;

/**
 * @author moli
 * @time 2024-02-22 21:57:50
 * @description 桥接模式
 */
public class BridgePattern {

    public static void main(String[] args) {

        ZhediePhone phone = new ZhediePhone(new XiaomiBrand());
        phone.open();
        phone.call();
        phone.off();
    }
}

package com.moli.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author moli
 * @time 2024-02-23 09:15:36
 * @description 装饰者模式
 */
public class DecoratorPattern {

    public static void main(String[] args) throws IOException {
        Drink drink = new LongBlack("黑巴咖啡", 10.0f);
        System.out.println(drink.cost());
        drink = new Chocolate("巧克力", 10.0f, drink);
        System.out.println(drink.cost());

        /*
            说明：
            1. InputStream 是抽象类，类似Drink，是被装饰者
            2. FileInputStream 是InputStream子类，类似 LongBlack
            3. FilterInputStream 里面含有InputStream实例，类似装饰者
            4. DataInputStream 是 FilterInputStream 子类，是具体的装饰者，类似Chocolate
         */
        DataInputStream dis = new DataInputStream(new FileInputStream("d:\\"));
        System.out.println(dis.read());
        dis.close();
    }
}

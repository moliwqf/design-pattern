package com.moli.observer;

/**
 * @author moli
 * @time 2024-02-23 19:25:16
 * @description 新浪接入方
 */
public class Sina implements Observer {

    private CurrentConditions conditions;

    public Sina(CurrentConditions currentConditions) {
        conditions = currentConditions;
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("天气更新，气温：" + temperature + "，气压：" + pressure + "，湿度：" + humidity);
        conditions.setTemperature(temperature);
        conditions.setPressure(pressure);
        conditions.setHumidity(humidity);
    }
}

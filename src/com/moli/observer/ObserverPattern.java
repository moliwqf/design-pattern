package com.moli.observer;

/**
 * @author moli
 * @time 2024-02-23 19:02:31
 * @description 观察者模式
 */
public class ObserverPattern {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData(new CurrentConditions(10f, 10f, 10f));
        Sina sina = new Sina(new CurrentConditions(0f, 0f, 0f));
        weatherData.register(sina);
        weatherData.updateConditions(new CurrentConditions(11f, 10f, 10f));
    }
}

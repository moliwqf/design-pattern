package com.moli.observer;

/**
 * @author moli
 * @time 2024-02-23 19:21:35
 * @description 状况
 */
public class CurrentConditions {

    private float temperature;

    private float pressure;

    private float humidity;

    public CurrentConditions(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}

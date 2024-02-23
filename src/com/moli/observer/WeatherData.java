package com.moli.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author moli
 * @time 2024-02-23 19:22:31
 * @description 天气信息
 */
public class WeatherData implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    private final CurrentConditions conditions;

    public WeatherData(CurrentConditions conditions) {
        this.conditions = conditions;
    }

    public void updateConditions(CurrentConditions conditions) {
        this.conditions.setTemperature(conditions.getTemperature());
        this.conditions.setPressure(conditions.getPressure());
        this.conditions.setHumidity(conditions.getHumidity());
        this.notifyObs();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        if (observers.isEmpty()) return;
        observers.remove(observer);
    }

    @Override
    public void notifyObs() {
        for (Observer observer : observers) {
            observer.update(conditions.getTemperature(), conditions.getPressure(), conditions.getHumidity());
        }
    }
}

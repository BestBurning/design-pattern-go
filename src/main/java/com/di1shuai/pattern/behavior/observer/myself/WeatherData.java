package com.di1shuai.pattern.behavior.observer.myself;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: Shea
 * @date: 2021/1/5
 * @description:
 */
public class WeatherData implements Subject {

    private List<Observer> observers;

    /**
     * 温度
     */
    private float temperature;

    /**
     * 湿度
     */
    private float humidity;

    /**
     * 压强
     */
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        observers.stream()
                .filter(Objects::nonNull)
                .forEach(o -> o.update(temperature, humidity, pressure));
    }


    /**
     * 测量通知
     */
    public void measurementChanges() {
        notifyObservers();
    }

    /**
     * 设置测量结果
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanges();
    }

}

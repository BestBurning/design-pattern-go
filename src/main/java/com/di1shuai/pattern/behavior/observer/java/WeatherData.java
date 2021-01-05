package com.di1shuai.pattern.behavior.observer.java;

import java.util.Observable;

/**
 * @author: Shea
 * @date: 2021/1/5
 * @description:
 */
public class WeatherData extends Observable {
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

    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

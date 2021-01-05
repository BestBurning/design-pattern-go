package com.di1shuai.pattern.behavior.observer.java;

import com.di1shuai.pattern.behavior.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: Shea
 * @date: 2021/1/5
 * @description:
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("目前状况: 温度->"+ temperature+"°C 湿度->"+humidity+"%");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}

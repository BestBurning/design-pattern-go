package com.di1shuai.pattern.behavior.observer.myself;

import com.di1shuai.pattern.behavior.observer.DisplayElement;

/**
 * @author: Shea
 * @date: 2021/1/5
 * @description:
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("目前状况: 温度->"+ temperature+"°C 湿度->"+humidity+"%");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}

package com.di1shuai.pattern.behavior.observer.myself;

import java.util.Random;

/**
 * 气象站 -- 程序入口
 *
 *  气象站测得数据后，要显示在显示板上
 *
 *  温度                当前状态显示板
 *  湿度   ->  数据  ->  气相统计显示板
 *  压强                简单预报显示板
 *
 *
 *
 * @author: Shea
 * @date: 2021/1/5
 * @description:
 */
public class WeatherStation {

    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        while (true) {
            weatherData.setMeasurements(
                    10 + random.nextFloat()*10,
                    50 + random.nextFloat() * 20,
                    29 + random.nextFloat()
            );
            Thread.sleep(1000);
        }
    }

}

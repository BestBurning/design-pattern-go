package com.di1shuai.pattern.create.singleton;

/**
 * @author: Shea
 * @date: 2020/7/1
 * @description:
 * 饿汉式 线程安全 Sychronized
 *
 *
 *
 */
public class SingletonLazySynchronized {

    private static SingletonLazySynchronized instance;

    private SingletonLazySynchronized() {

    }

    public static synchronized SingletonLazySynchronized getInstance() {
        if (instance == null) {
            instance = new SingletonLazySynchronized();
        }
        return instance;
    }

}

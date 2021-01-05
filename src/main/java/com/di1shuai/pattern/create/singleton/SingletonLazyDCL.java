package com.di1shuai.pattern.create.singleton;

/**
 * @author: Shea
 * @date: 2020/7/1
 * @description: 饿汉式 线程安全 双重校验锁
 *
 * Double Check Lock
 * volatile
 *
 *
 *
 */
public class SingletonLazyDCL {

    private static volatile SingletonLazyDCL instance;

    private SingletonLazyDCL() {

    }

    public static SingletonLazyDCL getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyDCL.class) {
                if (instance == null) {
                    instance = new SingletonLazyDCL();
                }
            }
        }
        return instance;
    }

}

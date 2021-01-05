package com.di1shuai.pattern.create.singleton;

/**
 * @author: Shea
 * @date: 2020/7/1
 * @description: 单例  懒汉式  线程不安全
 */
public class SingletonLazyNotSafe {

    private static SingletonLazyNotSafe instance;

    private SingletonLazyNotSafe() {

    }

    public static SingletonLazyNotSafe getInstance() {
        if (instance == null) {
            //多线程情况下可能产生多个
            instance = new SingletonLazyNotSafe();
        }
        return instance;
    }

}

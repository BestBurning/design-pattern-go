package com.di1shuai.pattern.create.singleton;

/**
 * @author: Shea
 * @date: 2020/7/1
 * @description: 单例模式
 * 饿汉式 不管用没用 先创建了再说
 *
 * 缺点 浪费内存空间
 *
 */
public class SingletonSafe {

    private static SingletonSafe instance = new SingletonSafe();

    private SingletonSafe() {
    }

    public static SingletonSafe getInstance(){
        return instance;
    }

}

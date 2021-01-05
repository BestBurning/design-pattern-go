package com.di1shuai.pattern.create.singleton;

/**
 * @author: Shea
 * @date: 2020/7/1
 * @description:
 * 使用枚举延迟加载
 *
 *
 */
public class SingletonEnum {


    private SingletonEnum(){

    }


    enum Singleton{
        INSTANCE;

        private final SingletonEnum instance;

        Singleton(){
            instance = new SingletonEnum();
        }

        private SingletonEnum getInstance(){
            return instance;
        }


    }


    public static SingletonEnum getInstance(){
        return Singleton.INSTANCE.getInstance();
    }



}



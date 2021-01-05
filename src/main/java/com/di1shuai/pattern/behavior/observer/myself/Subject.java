package com.di1shuai.pattern.behavior.observer.myself;

/**
 * @author: Shea
 * @date: 2021/1/5
 * @description:
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();


}

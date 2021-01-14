package com.di1shuai.pattern.create.builder.demo1;

/**
 * @author: Shea
 * @date: 2021/1/14
 * @description:
 */
public class ComputerDirector {

    public void makeComputer(ComputerBuilder builder){
        builder.setUsbCount();
        builder.setDisplay();
        builder.setKeyboard();
    }

}

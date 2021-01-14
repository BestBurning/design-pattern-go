package com.di1shuai.pattern.create.builder.demo1;

/**
 * @author: Shea
 * @date: 2021/1/14
 * @description:
 */
public abstract class ComputerBuilder {

    public abstract void setUsbCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();

    public abstract Computer getComputer();

}

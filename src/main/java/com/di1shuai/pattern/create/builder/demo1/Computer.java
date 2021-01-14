package com.di1shuai.pattern.create.builder.demo1;

import lombok.Data;

/**
 * @author: Shea
 * @date: 2021/1/14
 * @description:
 */
@Data
public class Computer {

    /**
     * 必选
     */
    private String cpu;

    /**
     * 必选
     */
    private String ram;

    /**
     * 可选
     */
    private int usbCount;

    /**
     * 可选
     */
    private String keyboard;

    /**
     * 可选
     */
    private String display;

    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

}

package com.di1shuai.pattern.create.builder.demo2;

/**
 * @author: Shea
 * @date: 2021/1/14
 * @description:
 */
public class ComputerMain {

    public static void main(String[] args) {
        Computer computer=new Computer.Builder("因特尔","三星")
                .setDisplay("三星24寸")
                .setKeyboard("罗技")
                .setUsbCount(2)
                .build();
        System.out.println(computer);
    }

}

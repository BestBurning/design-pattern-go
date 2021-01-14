package com.di1shuai.pattern.create.builder.demo1;

/**
 * @author: Shea
 * @date: 2021/1/14
 * @description:
 */
public class ComputerMain {

    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector();

        MacComputerBuilder macComputerBuilder = new MacComputerBuilder("I5处理器","三星125");
        computerDirector.makeComputer(macComputerBuilder);
        Computer macComputer = macComputerBuilder.getComputer();
        System.out.println(macComputer);

        HuaweiComputerBuilder huaweiComputerBuilder = new HuaweiComputerBuilder("I7处理器","海力士222");
        computerDirector.makeComputer(huaweiComputerBuilder);
        Computer huaweiComputer = huaweiComputerBuilder.getComputer();
        System.out.println(huaweiComputer);

    }

}

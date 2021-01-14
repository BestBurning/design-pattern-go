package com.di1shuai.pattern.create.builder.demo1;

/**
 * @author: Shea
 * @date: 2021/1/14
 * @description:
 */
public class HuaweiComputerBuilder extends ComputerBuilder{

    private Computer computer;

    HuaweiComputerBuilder(String cpu,String ram){
        computer = new Computer(cpu,ram);
    }


    @Override
    public void setUsbCount() {
        computer.setUsbCount(4);
    }
    @Override
    public void setKeyboard() {
        computer.setKeyboard("华为键盘");
    }
    @Override
    public void setDisplay() {
        computer.setDisplay("京东方显示器");
    }
    @Override
    public Computer getComputer() {
        return computer;
    }
}

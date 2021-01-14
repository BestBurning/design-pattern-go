package com.di1shuai.pattern.create.builder.demo1;

/**
 * @author: Shea
 * @date: 2021/1/14
 * @description:
 */
public class MacComputerBuilder extends ComputerBuilder{

    private Computer computer;

    MacComputerBuilder(String cpu, String ram){
        computer = new Computer(cpu,ram);
    }


    @Override
    public void setUsbCount() {
        computer.setUsbCount(2);
    }
    @Override
    public void setKeyboard() {
        computer.setKeyboard("苹果键盘");
    }
    @Override
    public void setDisplay() {
        computer.setDisplay("苹果显示器");
    }
    @Override
    public Computer getComputer() {
        return computer;
    }
}

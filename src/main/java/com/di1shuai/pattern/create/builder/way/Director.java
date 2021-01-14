package com.di1shuai.pattern.create.builder.way;

/**
 * @author: Shea
 * @date: 2021/1/13
 * @description:
 * 起到封装的作用，避免高层模块深入到建造者内部的实现类
 *
 */
public class Director {

    private Builder builder = new ConcreteProductBuilder();

    public Product getAProduct() {
        builder.setPart();
        return builder.buildProduct();
    }

}

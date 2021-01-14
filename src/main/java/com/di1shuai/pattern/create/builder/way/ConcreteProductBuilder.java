package com.di1shuai.pattern.create.builder.way;

/**
 * @author: Shea
 * @date: 2021/1/13
 * @description:
 */
public class ConcreteProductBuilder extends Builder {

    private Product product = new Product();

    @Override
    public void setPart() {
        //逻辑处理
    }

    /**
     * 组建产品
     * @return
     */
    @Override
    public Product buildProduct() {
        return product;
    }
}

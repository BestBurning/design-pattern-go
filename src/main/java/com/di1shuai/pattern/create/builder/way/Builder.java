package com.di1shuai.pattern.create.builder.way;

/**
 * @author: Shea
 * @date: 2021/1/13
 * @description:
 */
public abstract class Builder {

    /**
     * 设置产品的不同的部分
     */
    public abstract void setPart();


    /**
     * 建造产品
     * @return 产品
     */
    public abstract Product buildProduct();


}

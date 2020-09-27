package com.jieachan.factory.headset;

/**
 * 耳机
 *
 * @author jieachan
 * @create 2020/9/23
 */
public abstract class Headset {
    /**
     * 品牌
     */
    protected String brand;

    abstract void play();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}

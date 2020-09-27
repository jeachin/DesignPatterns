package com.jieachan.factory.abstractfactory;

import com.jieachan.factory.headset.Headset;
import com.jieachan.factory.phone.Phone;

/**
 * 专卖店D
 * @author jieachan
 * @create 2020/9/23
 */
public class StoreD {
    private Factory factory;

    public StoreD(Factory factory) {
        super();
        this.factory = factory;
    }

    /**
     * 补充手机
     */
    public void supplyPhone() {
        Phone phone = factory.getPhone();
        // 补充手机逻辑...
        System.out.println("补充" + phone.getBrand() + "手机完成");
    }

    /**
     * 补充耳机
     */
    public void supplyHeadset() {
        Headset headset = factory.getHeadset();
        // 补充耳机逻辑...
        System.out.println("补充" + headset.getBrand() + "耳机完成");
    }

    public static void main(String[] args) {
        StoreD storeC = new StoreD(new SonyFactory());
        storeC.supplyPhone();
        storeC.supplyHeadset();
    }
}

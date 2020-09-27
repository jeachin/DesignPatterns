package com.jieachan.factory.simplefactory;

import com.jieachan.factory.phone.Phone;

/**
 * 专卖店A
 * @author jieachan
 * @create 2020/9/23
 */
public class StoreA {
    private int brand;

    public StoreA(int brand) {
        super();
        this.brand = brand;
    }

    /**
     * 补充手机
     */
    public void supplyPhone() {
        Phone phone = SimplePhoneFactory.getPhone(brand);
        // 补充手机逻辑...
        System.out.println("补充" + phone.getBrand() + "手机完成");
    }

    public static void main(String[] args) {
        StoreA storeA = new StoreA(0);
        storeA.supplyPhone();
    }
}

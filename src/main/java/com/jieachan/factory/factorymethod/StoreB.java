package com.jieachan.factory.factorymethod;

import com.jieachan.factory.phone.Phone;

/**
 * 专卖店B
 * @author jieachan
 * @create 2020/9/23
 */
public class StoreB {
    private PhoneFactory phoneFactory;

    public StoreB(PhoneFactory phoneFactory) {
        super();
        this.phoneFactory = phoneFactory;
    }

    /**
     * 补充手机
     */
    public void supplyPhone() {
        Phone phone = phoneFactory.getPhone();
        // 补充手机逻辑...
        System.out.println("补充" + phone.getBrand() + "手机完成");
    }

    public static void main(String[] args) {
        StoreB storeB = new StoreB(new SonyPhoneFactory());
        storeB.supplyPhone();
    }

}

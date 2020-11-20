package cn.mrxccc.factory.abstractfactory;

import cn.mrxccc.factory.factorymethod.PhoneFactory;
import cn.mrxccc.factory.factorymethod.SonyPhoneFactory;
import cn.mrxccc.factory.headset.Headset;
import cn.mrxccc.factory.phone.Phone;

/**
 * 专卖店C：用于演示工厂方法模式增加商品
 * @author mrxccc
 * @create 2020/9/23
 */
public class StoreC {
    private PhoneFactory phoneFactory;
    private HeadsetFactory headsetFactory;

    public StoreC(PhoneFactory phoneFactory, HeadsetFactory headsetFactory) {
        super();
        this.phoneFactory = phoneFactory;
        this.headsetFactory = headsetFactory;
    }

    /**
     * 补充手机
     */
    public void supplyPhone() {
        Phone phone = phoneFactory.getPhone();
        // 补充手机逻辑...
        System.out.println("补充" + phone.getBrand() + "手机完成");
    }

    /**
     * 补充耳机
     */
    public void supplyHeadset() {
        Headset headset = headsetFactory.getHeadset();
        // 补充耳机逻辑...
        System.out.println("补充" + headset.getBrand() + "耳机完成");
    }

    public static void main(String[] args) {
        StoreC storeD = new StoreC(new SonyPhoneFactory(), new SonyHeadsetFactory());
        storeD.supplyPhone();
        storeD.supplyHeadset();
    }
}

package aidd.factory.abstractfactory;

import aidd.factory.factorymethod.PhoneFactory;
import aidd.factory.factorymethod.SonyPhoneFactory;
import aidd.factory.headset.Headset;
import aidd.factory.phone.Phone;

/**
 * 专卖店C
 * @author jeachin
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

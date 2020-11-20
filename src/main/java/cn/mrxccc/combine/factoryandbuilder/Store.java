package cn.mrxccc.combine.factoryandbuilder;

import cn.mrxccc.factory.phone.Phone;

/**
 * 工厂方法-建造者
 *
 * @author mrxccc
 * @create 2020/9/23
 */
public class Store {
    private PhoneFactory phoneFactory;

    public Store(PhoneFactory phoneFactory) {
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
        Store store = new Store(new ApplePhoneFactory());
        store.supplyPhone();
    }
}

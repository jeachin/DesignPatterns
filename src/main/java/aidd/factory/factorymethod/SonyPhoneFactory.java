package aidd.factory.factorymethod;

import aidd.factory.phone.SonyPhone;

/**
 * 索尼手机工厂
 * @author jieachan
 * @create 2020/9/23
 */
public class SonyPhoneFactory implements PhoneFactory {
    @Override
    public SonyPhone getPhone() {
        SonyPhone sonyPhone = new SonyPhone();
        sonyPhone.setBrand("Sony");
        return sonyPhone;
    }
}

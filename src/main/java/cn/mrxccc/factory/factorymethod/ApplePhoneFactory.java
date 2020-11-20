package cn.mrxccc.factory.factorymethod;

import cn.mrxccc.factory.phone.ApplePhone;

/**
 * 苹果手机工厂
 *
 * @author mrxccc
 * @create 2020/9/23
 */
public class ApplePhoneFactory implements PhoneFactory {
    @Override
    public ApplePhone getPhone() {
        ApplePhone applePhone = new ApplePhone();
        applePhone.setBrand("Apple");
        return applePhone;
    }
}

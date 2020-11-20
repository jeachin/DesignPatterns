package cn.mrxccc.factory.simplefactory;

import cn.mrxccc.factory.phone.ApplePhone;
import cn.mrxccc.factory.phone.Phone;
import cn.mrxccc.factory.phone.SonyPhone;

/**
 * 手机工厂
 *
 * @author mrxccc
 * @create 2020/9/23
 */
public class SimplePhoneFactory {
    public static Phone getPhone(int brand) {
        if (brand == 0) {
            ApplePhone applePhone = new ApplePhone();
            applePhone.setBrand("Apple");
            return applePhone;
        }

        SonyPhone sonyPhone = new SonyPhone();
        sonyPhone.setBrand("Sony");
        return sonyPhone;
    }
}

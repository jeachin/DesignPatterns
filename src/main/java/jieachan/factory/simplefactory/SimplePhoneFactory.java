package jieachan.factory.simplefactory;

import jieachan.factory.phone.ApplePhone;
import jieachan.factory.phone.Phone;
import jieachan.factory.phone.SonyPhone;

/**
 * 手机工厂
 *
 * @author jieachan
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

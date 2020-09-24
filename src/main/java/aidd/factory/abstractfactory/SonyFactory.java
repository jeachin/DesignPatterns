package aidd.factory.abstractfactory;

import aidd.factory.headset.AppleHeadset;
import aidd.factory.headset.SonyHeadset;
import aidd.factory.phone.ApplePhone;
import aidd.factory.phone.SonyPhone;

/**
 * 索尼工厂
 *
 * @author jieachan
 * @create 2020/9/23
 */
public class SonyFactory implements Factory {
    @Override
    public SonyPhone getPhone() {
        SonyPhone sonyPhone = new SonyPhone();
        sonyPhone.setBrand("Sony");
        return sonyPhone;
    }

    @Override
    public SonyHeadset getHeadset() {
        SonyHeadset sonyHeadset = new SonyHeadset();
        sonyHeadset.setBrand("Sony");
        return sonyHeadset;
    }

}

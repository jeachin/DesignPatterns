package cn.mrxccc.factory.abstractfactory;

import cn.mrxccc.factory.headset.AppleHeadset;
import cn.mrxccc.factory.phone.ApplePhone;

/**
 * 苹果工厂
 * @author mrxccc
 * @create 2020/9/23
 */
public class AppleFactory extends Factory{
    @Override
    public ApplePhone getPhone() {
        ApplePhone applePhone = new ApplePhone();
        applePhone.setBrand("Apple");
        return applePhone;
    }

    @Override
    public AppleHeadset getHeadset() {
        AppleHeadset appleHeadset = new AppleHeadset();
        appleHeadset.setBrand("Apple");
        return appleHeadset;
    }

}

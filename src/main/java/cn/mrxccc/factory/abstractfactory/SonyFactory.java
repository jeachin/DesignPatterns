package cn.mrxccc.factory.abstractfactory;

import cn.mrxccc.factory.headset.SonyHeadset;
import cn.mrxccc.factory.phone.SonyPhone;

/**
 * 索尼工厂
 *
 * @author mrxccc
 * @create 2020/9/23
 */
public class SonyFactory extends Factory {
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

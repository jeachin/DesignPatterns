package cn.mrxccc.factory.abstractfactory;

import cn.mrxccc.factory.headset.SonyHeadset;

/**
 * 索尼耳机工厂
 *
 * @author mrxccc
 * @create 2020/9/23
 */

public class SonyHeadsetFactory implements HeadsetFactory {
    @Override
    public SonyHeadset getHeadset() {
        SonyHeadset sonyHeadset = new SonyHeadset();
        sonyHeadset.setBrand("Sony");
        return sonyHeadset;
    }
}

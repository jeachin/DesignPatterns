package cn.mrxccc.factory.abstractfactory;

import cn.mrxccc.factory.headset.AppleHeadset;

/**
 * 苹果耳机工厂
 *
 * @author mrxccc
 * @create 2020/9/23
 */
public class AppleHeadsetFactory implements HeadsetFactory {
    @Override
    public AppleHeadset getHeadset() {
        AppleHeadset appleHeadset = new AppleHeadset();
        appleHeadset.setBrand("Apple");
        return appleHeadset;
    }
}

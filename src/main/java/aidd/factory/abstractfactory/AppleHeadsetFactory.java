package aidd.factory.abstractfactory;

import aidd.factory.headset.AppleHeadset;

/**
 * 苹果耳机工厂
 *
 * @author jieachan
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

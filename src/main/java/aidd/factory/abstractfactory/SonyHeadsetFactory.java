package aidd.factory.abstractfactory;

import aidd.factory.headset.SonyHeadset;

/**
 * 索尼耳机工厂
 *
 * @author jieachan
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

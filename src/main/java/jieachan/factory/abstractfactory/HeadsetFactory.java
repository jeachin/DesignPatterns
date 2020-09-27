package jieachan.factory.abstractfactory;

import jieachan.factory.headset.Headset;

/**
 * 耳机工厂接口
 * @author jieachan
 * @create 2020/9/23
 * @since 1.0.0
 */
public interface HeadsetFactory {
    Headset getHeadset();
}

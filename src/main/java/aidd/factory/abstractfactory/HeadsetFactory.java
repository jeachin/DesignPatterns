package aidd.factory.abstractfactory;

import aidd.factory.headset.Headset;

/**
 * 耳机工厂接口
 * @author jeachin
 * @create 2020/9/23
 * @since 1.0.0
 */
public interface HeadsetFactory {
    Headset getHeadset();
}

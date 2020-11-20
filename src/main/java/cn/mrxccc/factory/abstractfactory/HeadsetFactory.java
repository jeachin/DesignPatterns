package cn.mrxccc.factory.abstractfactory;

import cn.mrxccc.factory.headset.Headset;

/**
 * 耳机工厂接口
 * @author mrxccc
 * @create 2020/9/23
 * @since 1.0.0
 */
public interface HeadsetFactory {
    Headset getHeadset();
}

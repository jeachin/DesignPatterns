package cn.mrxccc.factory.abstractfactory;

import cn.mrxccc.factory.headset.Headset;
import cn.mrxccc.factory.phone.Phone;

/**
 * @author mrxccc
 * @create 2020/9/23
 */
public abstract class Factory {
    public abstract Phone getPhone();

    public abstract Headset getHeadset();
}

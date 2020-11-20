package cn.mrxccc.combine.factoryandbuilder;

import cn.mrxccc.factory.phone.Phone;

/**
 *
 //结合建造者模式的工厂类
 * @author mrxccc
 * @create 2020/9/23
 */
public class PhoneDirector {
    public Phone construct(PhoneBuilder builder) {
        builder.buildBrand();
        builder.buildOs();
        return builder.getResult();
    }
}

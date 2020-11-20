package cn.mrxccc.combine.factoryandbuilder;

import cn.mrxccc.factory.phone.Phone;

/**
 * @author mrxccc
 * @create 2020/9/23
 */
public interface PhoneBuilder {
    /**
     * 刻铭牌
     */
    void buildBrand();

    /**
     * 安装系统
     */
    void buildOs();

    Phone getResult();

}

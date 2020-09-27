package jieachan.combine.factoryandbuilder;

import jieachan.factory.phone.Phone;

/**
 * @author jieachan
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

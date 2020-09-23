package aidd.combine.factoryandbuilder;

import aidd.factory.phone.Phone;

/**
 * @author jeachin
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

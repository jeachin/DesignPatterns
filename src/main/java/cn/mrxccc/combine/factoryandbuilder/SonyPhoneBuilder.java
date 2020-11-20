package cn.mrxccc.combine.factoryandbuilder;

import cn.mrxccc.factory.phone.Phone;
import cn.mrxccc.factory.phone.SonyPhone;

/**
 * @author mrxccc
 * @create 2020/9/23
 */
public class SonyPhoneBuilder implements PhoneBuilder {
    private SonyPhone sonyPhone = new SonyPhone();

    @Override
    public void buildBrand() {
        sonyPhone.setBrand("Sony");
    }

    @Override
    public void buildOs() {
        sonyPhone.setOs("Android");
    }

    @Override
    public Phone getResult() {
        return sonyPhone;
    }
}

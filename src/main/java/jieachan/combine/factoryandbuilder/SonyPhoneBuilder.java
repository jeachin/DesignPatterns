package jieachan.combine.factoryandbuilder;

import jieachan.factory.phone.Phone;
import jieachan.factory.phone.SonyPhone;

/**
 * @author jieachan
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

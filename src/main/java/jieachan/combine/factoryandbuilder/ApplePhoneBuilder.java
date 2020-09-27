package jieachan.combine.factoryandbuilder;

import jieachan.factory.phone.ApplePhone;
import jieachan.factory.phone.Phone;

/**
 * @author jieachan
 * @create 2020/9/23
 */
public class ApplePhoneBuilder implements PhoneBuilder {
    private ApplePhone applePhone = new ApplePhone();

    @Override
    public void buildBrand() {
        applePhone.setBrand("Apple");
    }

    @Override
    public void buildOs() {
        applePhone.setOs("IOS");
    }

    @Override
    public Phone getResult() {
        return applePhone;
    }
}


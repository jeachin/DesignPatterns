package aidd.combine.factoryandbuilder;

import aidd.factory.phone.Phone;
import aidd.factory.phone.SonyPhone;

/**
 * @author jeachin
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

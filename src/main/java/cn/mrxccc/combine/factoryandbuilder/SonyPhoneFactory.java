package cn.mrxccc.combine.factoryandbuilder;

import cn.mrxccc.factory.phone.SonyPhone;

/**
 * @author mrxccc
 * @create 2020/9/23
 */

public class SonyPhoneFactory implements PhoneFactory {
    private PhoneDirector director = new PhoneDirector();

    @Override
    public SonyPhone getPhone() {
        SonyPhoneBuilder builder = new SonyPhoneBuilder();
        return (SonyPhone) director.construct(builder);
    }
}

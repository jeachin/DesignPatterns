package com.jieachan.combine.factoryandbuilder;

import com.jieachan.factory.phone.SonyPhone;

/**
 * @author jieachan
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

package com.jieachan.factory.abstractfactory;

import com.jieachan.factory.headset.Headset;
import com.jieachan.factory.phone.Phone;

/**
 * @author jieachan
 * @create 2020/9/23
 */
public interface Factory {
    Phone getPhone();

    Headset getHeadset();
}

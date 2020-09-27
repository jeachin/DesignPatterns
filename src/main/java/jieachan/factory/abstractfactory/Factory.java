package jieachan.factory.abstractfactory;

import jieachan.factory.headset.Headset;
import jieachan.factory.phone.Phone;

/**
 * @author jieachan
 * @create 2020/9/23
 */
public interface Factory {
    Phone getPhone();

    Headset getHeadset();
}

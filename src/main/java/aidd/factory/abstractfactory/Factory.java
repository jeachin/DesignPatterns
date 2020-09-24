package aidd.factory.abstractfactory;

import aidd.factory.headset.Headset;
import aidd.factory.phone.Phone;

/**
 * @author jieachan
 * @create 2020/9/23
 */
public interface Factory {
    Phone getPhone();

    Headset getHeadset();
}

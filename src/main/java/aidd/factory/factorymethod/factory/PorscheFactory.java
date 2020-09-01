package aidd.factory.factorymethod.factory;

import aidd.factory.factorymethod.product.Vehicle;
import aidd.factory.factorymethod.product.SUV;

/**
 * 〈保时捷〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class PorscheFactory implements Factory {

    @Override
    public Vehicle createVehicle() {
        return new SUV();
    }
}

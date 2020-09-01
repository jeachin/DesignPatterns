package aidd.factory.factorymethod.factory;

import aidd.factory.factorymethod.product.Vehicle;
import aidd.factory.factorymethod.product.Wagon;

/**
 * 〈大众汽车〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class VolkswagenFactory implements Factory {
    @Override
    public Vehicle createVehicle() {
        return new Wagon();
    }
}

package aidd.factory.factorymethod.factory;

import aidd.factory.factorymethod.product.Vehicle;
import aidd.factory.factorymethod.product.Pickup;

/**
 * 〈奥迪汽车〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class AudiFactory implements Factory {

    @Override public Vehicle createVehicle() {
        return new Pickup();
    }
}

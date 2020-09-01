package aidd.factory.abstractfactory.factory;

import aidd.factory.abstractfactory.product.Vehicle;
import aidd.factory.abstractfactory.product.Pickup;
import aidd.factory.abstractfactory.product.SUV;
import aidd.factory.abstractfactory.product.Wagon;

/**
 * 〈大众汽车〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class VolkswagenFactory implements Factory {

    private String factoryName = "大众汽车";

    @Override
    public Vehicle createPickupVehicle() {
        System.out.println(factoryName + "生产皮卡车");
        return new Pickup();
    }

    @Override
    public Vehicle createSUVVehicle() {
        System.out.println(factoryName + "SUV");
        return new SUV();
    }

    @Override
    public Vehicle createWagonVehicle() {
        System.out.println(factoryName + "轿车");
        return new Wagon();
    }
}

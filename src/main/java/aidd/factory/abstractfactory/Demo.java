package aidd.factory.abstractfactory;

import aidd.factory.abstractfactory.factory.Factory;
import aidd.factory.abstractfactory.factory.VolkswagenFactory;
import aidd.factory.abstractfactory.product.Vehicle;

/**
 * 〈〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class Demo {
    public static void main(String[] args) {
        // 创建抽象工厂
        Factory factory = new VolkswagenFactory();
        Vehicle pickupVehicle = factory.createPickupVehicle();
        Vehicle suvVehicle = factory.createSUVVehicle();
        Vehicle wagonVehicle = factory.createWagonVehicle();
        pickupVehicle.show();
        suvVehicle.show();
        wagonVehicle.show();
    }
}

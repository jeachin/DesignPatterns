package aidd.factory.factorymethod;

import aidd.factory.factorymethod.factory.AudiFactory;
import aidd.factory.factorymethod.factory.PorscheFactory;
import aidd.factory.factorymethod.factory.VolkswagenFactory;
import aidd.factory.factorymethod.product.Vehicle;

/**
 * 〈〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class Demo {
    public static void main(String[] args) {
        // 奥迪工厂生产皮卡车
        Vehicle pickup = new AudiFactory().createVehicle();
        // 保时捷工厂生产SUV
        Vehicle suv = new PorscheFactory().createVehicle();
        // 大众汽车生产轿车
        Vehicle wagon = new VolkswagenFactory().createVehicle();
        pickup.show();
        suv.show();
        wagon.show();
    }
}

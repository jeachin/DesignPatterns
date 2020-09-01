package aidd.factory.simplefactory;

import aidd.factory.simplefactory.product.Vehicle;

/**
 * 〈〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class Demo {
    public static void main(String[] args) {
        // 生产皮卡车
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.createVehicle(VehicleEnum.SUV);
        vehicle.show();
    }
}

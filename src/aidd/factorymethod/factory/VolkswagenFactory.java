package aidd.factorymethod.factory;

import aidd.factorymethod.Factory;
import aidd.factorymethod.Vehicle;
import aidd.factorymethod.product.Pickup;
import aidd.factorymethod.product.SUV;
import aidd.factorymethod.product.Wagon;

/**
 * 〈大众汽车〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class VolkswagenFactory extends Factory {
    private final String name = "Volkswagen";
    @Override
    public Vehicle createVehicle(String vehicleType) {
        Vehicle vehicle = null;
        switch (vehicleType) {
            case "pickup":
                vehicle = new Pickup(name);
                break;
            case "suv":
                vehicle = new SUV(name);
                break;
            case "wagon":
                vehicle = new Wagon(name);
                break;
            default:
                return null;
        }
        return vehicle;
    }
}

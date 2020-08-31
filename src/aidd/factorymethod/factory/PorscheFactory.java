package aidd.factorymethod.factory;

import aidd.factorymethod.Factory;
import aidd.factorymethod.Vehicle;
import aidd.factorymethod.product.Pickup;
import aidd.factorymethod.product.SUV;
import aidd.factorymethod.product.Wagon;

/**
 * 〈保时捷〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class PorscheFactory extends Factory {
    private final String name = "Porsche";
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

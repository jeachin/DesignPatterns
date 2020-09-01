package aidd.factory.simplefactory;
import aidd.factory.simplefactory.product.Pickup;
import aidd.factory.simplefactory.product.SUV;
import aidd.factory.simplefactory.product.Vehicle;
import aidd.factory.simplefactory.product.Wagon;

/**
 * 〈奥迪汽车〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class VehicleFactory {
    public Vehicle createVehicle(VehicleEnum vehicleType) {
        Vehicle vehicle = null;
        switch (vehicleType) {
            case PICKUP:
                vehicle = new Pickup();
                break;
            case SUV:
                vehicle = new SUV();
                break;
            case WAGON:
                vehicle = new Wagon();
                break;
            default:
                return null;
        }
        return vehicle;
    }
}

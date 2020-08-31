package aidd.factorymethod;

/**
 * 〈抽象工厂〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public abstract class Factory {
    /**
     * 创建车辆的抽象方法
     * @param vehicleType
     * @return
     */
    public abstract Vehicle createVehicle(String vehicleType);
}

package aidd.factory.abstractfactory.factory;

import aidd.factory.abstractfactory.product.Vehicle;

/**
 * 〈抽象工厂〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public interface Factory {
    /**
     * 功能描述: 创建皮卡车
     * @Param []
     * @return
     * @author caijiacheng
     * @date 2020/9/1 14:20
     */
    Vehicle createPickupVehicle();

    /**
     * 功能描述: 生产SUV
     * @Param []
     * @return
     * @author caijiacheng
     * @date 2020/9/1 14:23
     */
    Vehicle createSUVVehicle();

    /**
     * 功能描述: 生产轿车
     * @Param []
     * @return
     * @author caijiacheng
     * @date 2020/9/1 14:24
     */
    Vehicle createWagonVehicle();
}

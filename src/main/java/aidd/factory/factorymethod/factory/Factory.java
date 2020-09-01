package aidd.factory.factorymethod.factory;

import aidd.factory.factorymethod.product.Vehicle;

/**
 * 〈抽象工厂〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public interface Factory {
    /**
     * 功能描述:
     * @Param []
     * @return 
     * @author caijiacheng
     * @date 2020/9/1 13:37
     */
    Vehicle createVehicle();
}

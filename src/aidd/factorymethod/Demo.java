package aidd.factorymethod;

import aidd.factorymethod.factory.AudiFactory;
import aidd.factorymethod.factory.PorscheFactory;

/**
 * 〈〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class Demo {
    public static void main(String[] args) {
        // 生产奥迪-皮卡车
        AudiFactory audiFactory = new AudiFactory();
        audiFactory.createVehicle("pickup").production();
        // 生产保时捷-SUV
        PorscheFactory porscheFactory = new PorscheFactory();
        porscheFactory.createVehicle("suv").production();
    }
}

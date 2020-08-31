package aidd.factorymethod.product;

import aidd.factorymethod.Vehicle;

/**
 * 〈皮卡车〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class Pickup extends Vehicle {
    private String vendor;

    public Pickup(String vendor) {
        this.vendor = vendor;
    }

    @Override protected void production() {
        System.out.println(vendor + "：皮卡车");
    }
}

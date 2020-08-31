package aidd.factorymethod.product;

import aidd.factorymethod.Vehicle;

/**
 * 〈轿车〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class Wagon extends Vehicle {
    private String vendor;

    public Wagon(String vendor) {
        this.vendor = vendor;
    }

    @Override protected void production() {
        System.out.println(vendor + "：轿车");
    }
}

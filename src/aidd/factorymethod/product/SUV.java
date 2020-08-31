package aidd.factorymethod.product;

import aidd.factorymethod.Vehicle;

/**
 * 〈SUV〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class SUV extends Vehicle {
    private String vendor;

    public SUV(String vendor) {
        this.vendor = vendor;
    }

    @Override protected void production() {
        System.out.println(vendor + "：SUV");
    }
}

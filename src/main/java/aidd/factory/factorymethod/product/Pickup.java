package aidd.factory.factorymethod.product;

/**
 * 〈皮卡车〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class Pickup implements Vehicle {

    private String name = "皮卡车";

    @Override
    public void show() {
        System.out.println(name);
    }
}

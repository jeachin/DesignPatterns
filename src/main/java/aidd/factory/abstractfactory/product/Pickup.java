package aidd.factory.abstractfactory.product;

/**
 * 〈皮卡车〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class Pickup implements Vehicle {

    @Override
    public void show() {
        System.out.println("皮卡车");
    }
}

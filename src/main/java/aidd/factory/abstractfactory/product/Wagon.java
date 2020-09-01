package aidd.factory.abstractfactory.product;

/**
 * 〈轿车〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class Wagon implements Vehicle {

    @Override
    public void show() {
        System.out.println("轿车");
    }
}

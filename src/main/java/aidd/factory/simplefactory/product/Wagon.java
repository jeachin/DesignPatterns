package aidd.factory.simplefactory.product;

/**
 * 〈轿车〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class Wagon implements Vehicle {
    private String name = "轿车";

    @Override
    public void show () {
        System.out.println(name);
    }
}

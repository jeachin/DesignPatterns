package aidd.factory.simplefactory.product;

/**
 * 〈SUV〉
 *
 * @author caijiacheng
 * @create 2020/7/31
 */
public class SUV implements Vehicle {
    private String name = "SUV";

    @Override
    public void show () {
        System.out.println(name);
    }
}

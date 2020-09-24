package aidd.builder;

/**
 * 〈具体建造者〉
 *
 * @author jieachan
 * @create 2020/9/1
 */
public class ConcreteBuilder extends Builder {

    @Override public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}

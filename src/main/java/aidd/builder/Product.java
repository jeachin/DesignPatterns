package aidd.builder;

/**
 * 〈产品〉
 *
 * @author jeachin
 * @create 2020/9/1
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        System.out.println("partA：" + this.partA + " partB：" + this.partB + " partC：" + this.partC);
    }
}

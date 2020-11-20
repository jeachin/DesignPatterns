package cn.mrxccc.factory.headset;

/**
 * 耳机
 *
 * @author mrxccc
 * @create 2020/9/23
 */
public abstract class Headset {
    /**
     * 品牌
     */
    protected String brand;

    abstract void play();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}

package jieachan.factory.phone;

/**
 * @author jieachan
 * @create 2020/9/23
 */
public abstract class Phone {
    /**
     * 品牌
     */
    protected String brand;

    /**
     * 操作系统
     */
    protected String os;

    /**
     * 充电
     */
    public abstract void charge();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}

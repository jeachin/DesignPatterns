package aidd.factory.phone;

/**
 * 索尼手机
 *
 * @author jeachin
 * @create 2020/9/23
 */
public class SonyPhone extends Phone {
    @Override
    public void charge() {
        System.out.println("快充");
    }
}

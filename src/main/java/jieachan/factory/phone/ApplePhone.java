package jieachan.factory.phone;

/**
 * 苹果手机
 *
 * @author jieachan
 * @create 2020/9/23
 */
public class ApplePhone extends Phone {
    @Override
    public void charge() {
        System.out.println("普通充电");
    }
}

package cn.mrxccc.factory.phone;

/**
 * 苹果手机
 *
 * @author mrxccc
 * @create 2020/9/23
 */
public class ApplePhone extends Phone {
    @Override
    public void charge() {
        System.out.println("普通充电");
    }
}

package cn.mrxccc.factory.phone;

/**
 * 索尼手机
 *
 * @author mrxccc
 * @create 2020/9/23
 */
public class SonyPhone extends Phone {
    @Override
    public void charge() {
        System.out.println("快充");
    }
}

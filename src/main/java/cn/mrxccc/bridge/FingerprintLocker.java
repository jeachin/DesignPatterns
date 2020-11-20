package cn.mrxccc.bridge;

/**
 * 指纹解锁
 *
 * @author mrxccc
 * @create 2020/9/23
 */
public class FingerprintLocker implements Locker {
    @Override
    public void unlock() {
        System.out.println("指纹解锁");
    }
}

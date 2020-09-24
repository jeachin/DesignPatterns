package aidd.bridge;

/**
 * 人脸解锁
 * @author jieachan
 * @create 2020/9/23
 */
public class FaceLocker implements Locker {
    @Override
    public void unlock() {
        System.out.println("人脸解锁");
    }
}

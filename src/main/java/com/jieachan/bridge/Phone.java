package com.jieachan.bridge;

/**
 * @author jieachan
 * @create 2020/9/23
 */
public class Phone {
    private Charger charger;
    private Locker locker;
    // 增加一个功能，则加入该功能接口
//    private Camera camera;

    public void charge() {
        if (charger == null) {
            return;
        }

        charger.charge();
    }

    public void unlock() {
        if (locker == null) {
            return;
        }

        locker.unlock();
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }

    public void setLocker(Locker locker) {
        this.locker = locker;
    }

//    public void setCamera(Camera camera) {
//        this.camera = camera;
//    }
}

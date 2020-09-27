package com.jieachan.bridge;

/**
 * @author jieachan
 * @create 2020/9/23
 */
public class Store {
    /**
     * 补充手机
     */
    public void supplyPhone() {
        Phone phone = getSonyPhone();
//        Phone phone = getNokiaPhone();
        // 补充手机逻辑...
        System.out.println("补充手机完成");
    }

    private Phone getSonyPhone(){
        Phone phone = new Phone();
        phone.setCharger(new QuickCharger());
        phone.setLocker(new FaceLocker());
        return phone;
    }

    private Phone getApplePhone(){
        Phone phone = new Phone();
        phone.setCharger(new SimpleCharger());
        phone.setLocker(new FingerprintLocker());
        return phone;
    }

    /**
     * 功能描述: 专卖店直接增加一个获取拍照的手机方法
     * @Param []
     * @return
     * @author jieachan
     * @date 2020/9/23 16:15
     */
//    private Phone getNokiaPhone(){
//        Phone phone = new Phone();
//        phone.setCharger(new QuickCharger());
//        phone.setLocker(new FingerprintLocker());
//        //增加拍照功能
//        phone.setCamera(new DoubleCamera());
//        return phone;
//    }

}

package com.jieachan.factory.phone;

/**
 * 索尼手机
 *
 * @author jieachan
 * @create 2020/9/23
 */
public class SonyPhone extends Phone {
    @Override
    public void charge() {
        System.out.println("快充");
    }
}

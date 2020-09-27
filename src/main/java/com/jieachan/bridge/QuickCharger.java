package com.jieachan.bridge;

/**
 * 快充
 *
 * @author jieachan
 * @create 2020/9/23
 */
public class QuickCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("快速充电");
    }
}

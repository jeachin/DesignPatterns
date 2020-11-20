package cn.mrxccc.bridge;

/**
 * 快充
 *
 * @author mrxccc
 * @create 2020/9/23
 */
public class QuickCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("快速充电");
    }
}

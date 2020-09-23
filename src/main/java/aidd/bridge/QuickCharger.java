package aidd.bridge;

/**
 * 快充
 *
 * @author jeachin
 * @create 2020/9/23
 */
public class QuickCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("快速充电");
    }
}

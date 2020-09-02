package aidd.adapter.classadapter;

/**
 * 适配器角色
 *
 * @author caijiacheng
 * @create 2020/9/2
 */
public class PowerAdapter extends PowerAdaptee implements PowerTarget {
    @Override
    public int output5V() {
        int output = output220V();
        System.out.println("电源适配器开始工作，此时输出电压是：" + output);
        output = output / 44;
        System.out.println("电源适配器工作完成，此时输出电压是：" + output);
        return output;
    }
}

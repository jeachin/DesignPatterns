package jieachan.adapter.objectadapter;

/**
 * 适配器角色
 *
 * @author jieachan
 * @create 2020/9/2
 */
public class PowerAdapter implements PowerTarget {
    // 对象适配器的关键
    private PowerAdaptee powerAdaptee;

    public PowerAdapter(PowerAdaptee powerAdaptee){
        this.powerAdaptee = powerAdaptee;
    }

    @Override
    public int output5V() {
        int output = powerAdaptee.output220V();
        System.out.println("电源适配器开始工作，此时输出电压是：" + output);
        output = output / 44;
        System.out.println("电源适配器工作完成，此时输出电压是：" + output);
        return output;
    }
}

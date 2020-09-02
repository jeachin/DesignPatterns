package aidd.adapter.classadapter;

/**
 * 适配者角色
 * @author caijiacheng
 * @create 2020/9/2
 */
public class PowerAdaptee {
    private int output =  220;
    public int output220V() {
        System.out.println("电源输出电压：" + output);
        return output;
    }
}

package cn.mrxccc.composite;

/**
 * 抽象构建：物品
 *
 * @author mrxccc
 * @create 2020/9/4
 * @since 1.0.0
 */
public interface Articles {
    /**
     * 计算价格
     * @return
     */
    public float calculation();
    public void show();
}

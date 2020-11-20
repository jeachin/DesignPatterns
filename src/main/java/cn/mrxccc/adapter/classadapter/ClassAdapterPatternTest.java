package cn.mrxccc.adapter.classadapter;

/**
 * @author mrxccc
 * @create 2020/9/2
 */
public class ClassAdapterPatternTest {
    public static void main(String[] args) {
        PowerTarget target = new PowerAdapter();
        target.output5V();
    }
}

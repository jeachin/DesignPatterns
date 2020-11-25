package cn.mrxccc.builder;

/**
 * @author mrxccc
 * @create 2020/11/24
 */
public class BatchClient {
    public static void main(String[] args) {
        Director director = new Director();
        // 1万辆A类型的奔驰车
        for (int i = 0; i < 100; i++) {
            director.getABenzModel().run();
        }
        // 100万辆B类型的奔驰车
        for (int i = 0; i < 100; i++) {
            director.getBBenzModel().run();
        }
        // 1000万辆C类型的宝马车
        for (int i = 0; i < 100; i++) {
            director.getCBMWModel().run();
        }
    }
}

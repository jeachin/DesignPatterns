package cn.mrxccc.factory.headset;

/**
 * 索尼耳机
 *
 * @author mrxccc
 * @create 2020/9/23
 */
public class SonyHeadset extends Headset {
    @Override
    void play() {
        // Sony 耳机播放逻辑...
        System.out.println("Sony 耳机播放完成");
    }
}

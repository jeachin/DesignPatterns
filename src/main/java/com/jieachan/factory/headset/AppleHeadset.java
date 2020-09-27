package com.jieachan.factory.headset;

/**
 * 苹果耳机
 * @author jieachan
 * @create 2020/9/23
 */
public class AppleHeadset extends Headset{
    @Override
    void play() {
        // Apple 耳机播放逻辑 ...
        System.out.println("Apple 耳机播放完成");
    }
}

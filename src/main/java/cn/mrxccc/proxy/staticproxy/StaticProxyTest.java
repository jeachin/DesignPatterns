package cn.mrxccc.proxy.staticproxy;

import cn.mrxccc.proxy.JayChou;
import cn.mrxccc.proxy.ReceiveGift;

/**
 * @author mrxccc
 * @create 2020/9/9
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        //        String gift = "boom";
        String gift = "love";
        ReceiveGift receiveGift = new JayChou();
        StarStudio starStudio = new StarStudio(receiveGift);
        System.out.println("周董我是你粉丝，我要通过工作室给你送个礼物："+gift);
        starStudio.receive(gift);
    }
}

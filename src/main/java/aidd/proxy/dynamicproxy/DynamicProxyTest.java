package aidd.proxy.dynamicproxy;

import aidd.proxy.JayChou;
import aidd.proxy.ReceiveGift;
import aidd.proxy.staticproxy.StarStudio;

/**
 * @author jieachan
 * @create 2020/9/9
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        //       String gift = "boom";
        String gift = "love";

        StarStudioHandler starStudioHandler = new StarStudioHandler();
        ReceiveGift receiveGift = (ReceiveGift) starStudioHandler.newProxyInstance(new JayChou());
        System.out.println("周董我是你粉丝，我要通过动态工作室给你送个礼物："+gift);
        receiveGift.receive(gift);
    }
}

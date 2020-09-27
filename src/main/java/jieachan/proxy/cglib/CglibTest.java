package jieachan.proxy.cglib;

/**
 * @author jieachan
 * @create 2020/9/9
 */
public class CglibTest {
    public static void main(String[] args) {
        //        String gift = "boom";
        String gift = "love";

        StarStudioCglibProxy starStudioProxy = new StarStudioCglibProxy();
        System.out.println("周董我是你粉丝，我要通过cglib工作室给你送个礼物："+gift);
        starStudioProxy.receive(gift);
    }
}

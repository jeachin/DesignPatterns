package aidd.proxy;

/**
 * 真实主题类
 * @author caijiacheng
 * @create 2020/9/9
 */
public class JayChou implements ReceiveGift{
    /**
     * 周董收到礼物
     * @param gift
     */
    @Override
    public void receive(String gift) {
        System.out.println("收到礼物："+gift+",哎呦不错哦~");
    }
}

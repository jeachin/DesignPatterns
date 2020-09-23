package aidd.proxy.staticproxy;

import aidd.proxy.ReceiveGift;

/**
 * 代理类
 * @author jeachin
 * @create 2020/9/9
 */
public class StarStudio implements ReceiveGift {
    private ReceiveGift receiveGift = null;

    public StarStudio(ReceiveGift receiveGift) {
        this.receiveGift = receiveGift;
    }
    /**
     * 工作室接受礼物
     * @param gift
     */
    @Override
    public void receive(String gift){
        if(this.check(gift)){
            this.receiveGift.receive(gift);
        }

    }
    /**
     * 检查礼物
     */
    private boolean check(String gift){
        if("boom".equals(gift)){
            System.out.println("卧槽是炸弹，快跑");
            return false;
        }
        System.out.println("工作室检查通过，不是炸弹");
        return true;
    }
}

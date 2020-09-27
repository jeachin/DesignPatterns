package jieachan.proxy.cglib;

import jieachan.proxy.JayChou;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author jieachan
 * @create 2020/9/9
 */
public class StarStudioCglibProxy {
    /**
     * cglib收礼物
     */
    public void receive(String gift){
        if(!this.check(gift)) {
            return;
        }
        Enhancer enhancer = new Enhancer();
        //继承被代理类
        enhancer.setSuperclass(JayChou.class);
        //设置回调
        enhancer.setCallback(new GiftInterceptor());
        //设置代理类对象
        JayChou jayChou = (JayChou) enhancer.create();
        //在调用代理类中方法时会被我们实现的方法拦截器进行拦截
        jayChou.receive(gift);
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

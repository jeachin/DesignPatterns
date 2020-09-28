package com.jieachan.observer;

/**
 * 具体观察者
 *
 * @author jieachan
 * @create 2020/9/28
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getAction() + "\n" + name + "关闭股票行情，继续工作");
    }

}

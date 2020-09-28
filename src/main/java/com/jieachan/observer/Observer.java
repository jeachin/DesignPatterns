package com.jieachan.observer;

/**
 * 观察者
 * @author jieachan
 * @create 2020/9/28
 */
public abstract class Observer {

    protected String name;
    protected Subject subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();

}

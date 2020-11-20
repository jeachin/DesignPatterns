package cn.mrxccc.observer;

/**
 * 观察者
 * @author mrxccc
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

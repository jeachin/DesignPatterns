package jieachan.singleton;

/**
 * 懒汉式(线程安全，同步方法)
 *
 * @author jieachan
 * @create 2020/9/1
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        SingletonClass04 c1 = SingletonClass04.getInstance();
        SingletonClass04 c2 = SingletonClass04.getInstance();
        System.out.println(c1 == c2);
    }
}

// 懒汉式(线程安全，同步方法)
class SingletonClass04 {
    private static SingletonClass04 instance;
    //1. 构造器私有化, 外部不能new
    private SingletonClass04() {}

    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    //即懒汉式
    public static synchronized SingletonClass04 getInstance() {
        if(instance == null) {
            instance = new SingletonClass04();
        }
        return instance;
    }
}
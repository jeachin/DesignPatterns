package cn.mrxccc.singleton;

/**
 * 懒汉式(线程不安全)
 *
 * @author mrxccc
 * @create 2020/9/1
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        SingletonClass03 c1 = SingletonClass03.getInstance();
        SingletonClass03 c2 = SingletonClass03.getInstance();
        System.out.println(c1 == c2);
    }
}

class SingletonClass03 {
    private static SingletonClass03 instance;
    //1. 构造器私有化, 外部不能new
    private SingletonClass03() {
    }

    //提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    //即懒汉式
    public static SingletonClass03 getInstance() {
        if (instance == null) {
            instance = new SingletonClass03();
        }
        return instance;
    }
}

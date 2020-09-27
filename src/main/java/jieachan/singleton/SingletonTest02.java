package jieachan.singleton;

/**
 * 饿汉式（静态代码块）
 *
 * @author jieachan
 * @create 2020/9/1
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        SingletonClass02 c1 = SingletonClass02.getInstance();
        SingletonClass02 c2 = SingletonClass02.getInstance();
        System.out.println(c1 == c2);
    }
}

class SingletonClass02 {

    //1. 构造器私有化, 外部不能new
    private SingletonClass02() {

    }

    //2.本类内部创建对象实例
    private static SingletonClass02 instance;

    static { // 在静态代码块中，创建单例对象
        instance = new SingletonClass02();
    }

    //3. 提供一个公有的静态方法，返回实例对象
    public static SingletonClass02 getInstance() {
        return instance;
    }

}
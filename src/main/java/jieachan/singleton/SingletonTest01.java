package jieachan.singleton;

/**
 * 饿汉模式（静态常量）
 *
 * @author jieachan
 * @create 2020/9/1
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        SingletonClass01 c1 = SingletonClass01.getInstance();
        SingletonClass01 c2 = SingletonClass01.getInstance();
        System.out.println(c1 == c2);
    }
}
class SingletonClass01 {

    // 1. 构造器私有化, 外部能new
    private SingletonClass01() {

    }

    // 2.本类内部创建对象实例
    private final static SingletonClass01 instance = new SingletonClass01();

    // 3. 提供一个公有的静态方法，返回实例对象
    public static SingletonClass01 getInstance() {
        return instance;
    }
}
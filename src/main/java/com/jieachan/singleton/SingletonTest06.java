package com.jieachan.singleton;

/**
 * 静态内部类
 * @author jieachan
 * @create 2020/9/1
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        SingletonClass06 c1 = SingletonClass06.getInstance();
        SingletonClass06 c2 = SingletonClass06.getInstance();
        System.out.println(c1 == c2);
    }
}

// 静态内部类完成:外部类加载时并不需要立即加载内部类，内部类不被加载则不去初始化INSTANCE，故而不占内存
// 推荐使用
class SingletonClass06 {

    //构造器私有化
    private SingletonClass06() {}

    //写一个静态内部类,该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private static final SingletonClass06 INSTANCE = new SingletonClass06();
    }

    //提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE

    public static SingletonClass06 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}

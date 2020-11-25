package cn.mrxccc.singleton;

/**
 * 静态内部类
 * @author mrxccc
 * @create 2020/9/1
 */
public class SingletonTest06 {
    public static void main(String[] args) {
//        System.out.println("单线程创建实例=======");
//        SingletonClass06 c1 = SingletonClass06.getInstance();
//        SingletonClass06 c2 = SingletonClass06.getInstance();
//        System.out.println(c1 == c2);
        System.out.println("多线程创建实例=======");
        //创建10个线程, 在每个 线程中打印单例对象
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //调用Singleton.getInstance()返回单例对象,打印会输出对象的哈希码
                    System.out.println(SingletonClass06.getInstance());
                }
            }).start();
        }
        //程序运行后,输出单例的哈希码都相同,说明是同一个对象
    }
}

// 静态内部类完成:外部类加载时并不需要立即加载内部类，内部类不被加载则不去初始化INSTANCE，故而不占内存
// 推荐使用
class SingletonClass06 {

    //构造器私有化
    private SingletonClass06() {}

    //写一个静态内部类,该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private final static SingletonClass06 INSTANCE = new SingletonClass06();
    }

    //提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE

    public static SingletonClass06 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}

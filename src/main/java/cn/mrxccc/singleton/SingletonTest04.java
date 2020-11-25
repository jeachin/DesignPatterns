package cn.mrxccc.singleton;

/**
 * 懒汉式(线程安全，同步方法)
 *
 * @author mrxccc
 * @create 2020/9/1
 */
public class SingletonTest04 {
    public static void main(String[] args) {
//        System.out.println("单线程创建实例=======");
//        SingletonClass04 c1 = SingletonClass04.getInstance();
//        SingletonClass04 c2 = SingletonClass04.getInstance();
//        System.out.println(c1 == c2);

        System.out.println("多线程创建实例=======");
        //创建10个线程, 在每个 线程中打印单例对象
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //调用Singleton.getInstance()返回单例对象,打印会输出对象的哈希码
                    System.out.println(SingletonClass04.getInstance());
                }
            }).start();
        }
        //程序运行后,输出单例的哈希码都相同,说明是同一个对象
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
package cn.mrxccc.singleton;

/**
 * 懒汉式(线程不安全)
 *
 * @author mrxccc
 * @create 2020/9/1
 */
public class SingletonTest03 {
    public static void main(String[] args) {
//        System.out.println("单线程创建实例=======");
//        SingletonClass03 c1 = SingletonClass03.getInstance();
//        SingletonClass03 c2 = SingletonClass03.getInstance();
//        System.out.println(c1 == c2);
        System.out.println("多线程创建实例=======");
        //创建10个线程, 在每个 线程中打印单例对象
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //调用Singleton.getInstance()返回单例对象,打印会输出对象的哈希码
                    System.out.println(SingletonClass03.getInstance());
                }
            }).start();
        }
        //程序运行后,输出单例的哈希码都相同,说明是同一个对象
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

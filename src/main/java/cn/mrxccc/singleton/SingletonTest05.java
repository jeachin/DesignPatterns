package cn.mrxccc.singleton;

/**
 * 懒汉式(双重检查)
 * @author mrxccc
 * @create 2020/9/1
 */
public class SingletonTest05 {
    public static void main(String[] args) {
//        System.out.println("单线程创建实例=======");
//        SingletonClass05 c1 = SingletonClass05.getInstance();
//        SingletonClass05 c2 = SingletonClass05.getInstance();
//        System.out.println(c1 == c2);
        System.out.println("多线程创建实例=======");
        //创建10个线程, 在每个 线程中打印单例对象
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //调用Singleton.getInstance()返回单例对象,打印会输出对象的哈希码
                    System.out.println(SingletonClass05.getInstance());
                }
            }).start();
        }
        //程序运行后,输出单例的哈希码都相同,说明是同一个对象
    }
}

// 懒汉式(线程安全，同步方法)
class SingletonClass05 {
    // volatile禁止重排序
    private static /*volatile*/ SingletonClass05 instance;

    private SingletonClass05() {}

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    //同时保证了效率, 推荐使用
    public static SingletonClass05 getInstance() {
        if(instance == null) {
            synchronized (SingletonClass05.class) {
                if(instance == null) {
                    instance = new SingletonClass05();
                }
            }

        }
        return instance;
    }
}

package cn.mrxccc.singleton;

/**
 * 注册式单例模式(枚举)
 *
 * @author mrxccc
 * @create 2020/9/1
 */
public class SingletonTest07 {
    public static void main(String[] args) {
//        System.out.println("单线程创建实例=======");
//        SingletonEnum instance = SingletonEnum.INSTANCE;
//        SingletonEnum instance2 = SingletonEnum.INSTANCE;
//        System.out.println(instance == instance2);
//        System.out.println(instance.hashCode());
//        System.out.println(instance2.hashCode());
//        instance.sayOK();

        System.out.println("多线程创建实例=======");
        //创建10个线程, 在每个 线程中打印单例对象
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //调用Singleton.getInstance()返回单例对象,打印会输出对象的哈希码
                    System.out.println(SingletonEnum.INSTANCE);
                }
            }).start();
        }
        //程序运行后,输出单例的哈希码都相同,说明是同一个对象
    }
}

//使用枚举，可以实现单例, 推荐
enum SingletonEnum {
    INSTANCE; //属性
    public void sayOK() {
        System.out.println("ok~");
    }
}

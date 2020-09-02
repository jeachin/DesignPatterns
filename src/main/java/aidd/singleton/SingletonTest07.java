package aidd.singleton;

/**
 * 注册式单例模式(枚举)
 *
 * @author caijiacheng
 * @create 2020/9/1
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;
        System.out.println(instance == instance2);

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.sayOK();
    }
}

//使用枚举，可以实现单例, 推荐
enum SingletonEnum {
    INSTANCE; //属性
    public void sayOK() {
        System.out.println("ok~");
    }
}

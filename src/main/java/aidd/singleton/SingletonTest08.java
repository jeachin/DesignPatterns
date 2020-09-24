package aidd.singleton;

import java.lang.reflect.Constructor;

/**
 * 静态内部类+防止反射破坏单例
 * 
 * @author jieachan
 * @create 2020/9/1
 */
public class SingletonTest08 {
    public static void main(String[] args) throws Exception {
        Class clazz = SingletonClass08.class;
        Constructor constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Object c1 = constructor.newInstance();
        Object c2 = SingletonClass08.getInstance();
        System.out.println(c1 == c2);

    }
}

// 静态内部类完成:外部类加载时并不需要立即加载内部类，内部类不被加载则不去初始化INSTANCE，故而不占内存
// 推荐使用
class SingletonClass08 {

    // 构造器私有化
    private SingletonClass08() {
        if (SingletonInstance.INSTANCE != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    // 写一个静态内部类,该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private static final SingletonClass08 INSTANCE = new SingletonClass08();
    }

    // 提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
    public static SingletonClass08 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}

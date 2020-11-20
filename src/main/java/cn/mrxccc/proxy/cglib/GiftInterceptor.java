package cn.mrxccc.proxy.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author mrxccc
 * @create 2020/9/9
 */
public class GiftInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before: "  + method.getName());
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("After: " + method.getName());
        return object;
    }
}

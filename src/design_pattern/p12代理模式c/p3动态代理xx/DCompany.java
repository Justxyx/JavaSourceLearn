package design_pattern.p12代理模式c.p3动态代理xx;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xm
 * @date 2021/9/17 19:55
 * @description:
 */
public class DCompany implements InvocationHandler {

    // 代理对象需要包含真实对象，为提升真实对象的复用性，则使用Object接受
    private Object objFactory;

    public Object getObjFactory(){
        return objFactory;
    }

    public void setObjFactory(Object objFactory){
        this.objFactory = objFactory;
    }

    // 使用JDK代理类获取代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(objFactory.getClass().getClassLoader(), objFactory.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 进行业务增强
        System.out.println("JDK动态代理对业务进行了增强处理");
        // 通过反射调用方法本身
        Object invoke = method.invoke(objFactory, args);
        System.out.println("JDK动态代理对业务进行了增强处理结束");
        return invoke;
    }


}


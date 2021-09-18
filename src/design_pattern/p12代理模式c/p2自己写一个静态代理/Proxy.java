package design_pattern.p12代理模式c.p2自己写一个静态代理;

/**
 * @author xm
 * @date 2021/9/17 18:16
 * @description:
 */
public class Proxy implements Impl {
    Impl impl;

    public Proxy(Impl impl) {
        this.impl = impl;
    }


    @Override
    public void method1() {
        System.out.println("方法前");
        impl.method1();
        System.out.println("方法后");
    }
}


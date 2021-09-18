package design_pattern.p12代理模式c.p2自己写一个静态代理;

/**
 * @author xm
 * @date 2021/9/17 18:17
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Implxx implxx = new Implxx();
        Proxy proxy = new Proxy(implxx);
        proxy.method1();
    }
}


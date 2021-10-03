package design_pattern.test;

/**
 * @author xm
 * @date 2021/9/22 16:27
 * @description:
 */
public class B extends A {
    private String B;

    public B() {
        System.out.println("这是一个子类的无参构造");
    }

    public B(String a, String b) {
        super(a);
        System.out.println("这是一个子类的有参构造");
        B = b;
    }
}


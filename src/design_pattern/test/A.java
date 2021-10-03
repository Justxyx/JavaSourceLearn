package design_pattern.test;

/**
 * @author xm
 * @date 2021/9/22 16:21
 * @description:
 */
public class A {
    private String A;

    public A() {
        System.out.println("这是一个父类无参构造");
    }

    public A(String a) {
        A = a;
        System.out.println("这是一个父类有参构造");
    }
}


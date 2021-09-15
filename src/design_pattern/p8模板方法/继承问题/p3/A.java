package design_pattern.p8模板方法.继承问题.p3;

/**
 * @author xm
 * @date 2021/9/15 12:28
 * @description:
 */
public class A {
    private int a;
    private int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void method(){
        System.out.println(a+b);
    }
}


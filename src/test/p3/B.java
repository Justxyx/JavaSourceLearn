package test.p3;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 20:36
 */
public class B extends A {
    private int b;

    public B() {
        System.out.println("B的无参构造");
    }

    public B(int b) {
        this.b = b;
    }

    public B(int b, String a, String c) {

        this.b = b;
        System.out.println("B的有参构造");
    }
}


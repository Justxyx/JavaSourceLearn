package test.p1;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 12:52
 */
public class D extends A {
    public D() {
        System.out.println("D无参构造");
    }

    public D(String name) {
//        super(name);
        System.out.println("D有参构造");
    }
}


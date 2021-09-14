package test.p2;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 20:20
 */
public class B extends A {
    public B() {
        System.out.println("子类构造函数");
        System.out.println(super.getName() + super.getPwd());
    }
}


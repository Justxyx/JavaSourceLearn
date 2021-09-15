package design_pattern.p8模板方法.继承问题;

/**
 * @author xm
 * @date 2021/9/15 11:22
 * @description:
 */
public class Test01 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test3() {
        F f = new F();
        f.father();
    }

    private static void test2() {
        D d = new D();
        d.father();  // final 编译不通过
    }

    private static void test1() {
        B b = new B();
        b.father();   // private   -> son
    }
}


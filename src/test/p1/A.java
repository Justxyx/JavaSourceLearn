package test.p1;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 12:25
 */
public class A {
    private String name;

    public A() {
        System.out.println("A无参函数");
    }

    public A(String name) {
        System.out.println("A有参构造");
        this.name = name;
    }
}


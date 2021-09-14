package test.p3;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 20:35
 */
public class A {
    private String name;
    private String pwd;
    private int count;

    public A(String name, String pwd) {
        System.out.println("A的有参构造");
        this.name = name;
        this.pwd = pwd;
    }

    public A() {
        System.out.println("A的无参构造");
        name = "A";
        pwd = "B";
    }
}


package test;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 12:13
 */
public class Test02 extends Test01 {

    public Test02() {
        super();
    }

    public Test02(String name, String pwd) {
        super(name, pwd);
    }

    @Override
    void method1() {
        System.out.println("继承了一个抽象方法");
    }
}


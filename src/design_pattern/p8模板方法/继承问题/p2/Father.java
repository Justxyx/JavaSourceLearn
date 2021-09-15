package design_pattern.p8模板方法.继承问题.p2;

/**
 * @author xm
 * @date 2021/9/15 11:54
 * @description:
 */
public class Father {
    private int a;
    private int b;


    final void method1(){
        System.out.println("这是一个final方法");
        method2();
    }

    private void method2() {
        System.out.println("这是一个private方法");
    }

    public Father(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Father() {
    }

}


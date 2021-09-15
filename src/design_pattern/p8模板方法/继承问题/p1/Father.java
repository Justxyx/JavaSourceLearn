package design_pattern.p8模板方法.继承问题.p1;

/**
 * @author xm
 * @date 2021/9/15 11:33
 * @description:
 */
public class Father {

    private int a;
    private int b;

    public Father(int a, int b) {
        this.a = a;
        this.b = b;
    }

    final void test(){
        System.out.println("父类方法");
        System.out.println(a + "--" +b);
    }
}


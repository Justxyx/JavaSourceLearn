package design_pattern.p8模板方法.p2模板与钩子函数;

/**
 * @author xm
 * @date 2021/9/15 12:14
 * @description:
 */
public class Caffee extends CaffeeBeverage {

    boolean b;

    public Caffee() {
    }

    public Caffee(boolean b) {
        this.b = b;
    }

    @Override
    boolean hock() {
        return b;
    }

    @Override
    void method4() {
        System.out.println("重写方法4");
    }

    @Override
    void method3() {
        System.out.println("重写方法3");
    }
}


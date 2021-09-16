package design_pattern.p08模板方法.p1冲一杯咖啡吧;

/**
 * @author xm
 * @date 2021/9/15 10:52
 * @description:
 */
public class ATee extends CaffeeBeverage {
    @Override
    public void addA() {
        System.out.println("给茶叶加柠檬");
    }

    @Override
    void A() {
        System.out.println("浸泡茶叶");
    }
}


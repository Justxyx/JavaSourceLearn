package design_pattern.p08模板方法.p1冲一杯咖啡吧;

/**
 * @author xm
 * @date 2021/9/15 10:52
 * @description:
 */
public class ACaffee  extends CaffeeBeverage{


    @Override
    public void addA() {
        System.out.println("给咖啡加牛奶");
    }

    @Override
    void A() {
        System.out.println("冲泡咖啡");
    }
}


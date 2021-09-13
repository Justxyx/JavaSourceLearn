package design_pattern.p2装饰者模式.p1星巴克点餐例子;

import java.util.concurrent.locks.Condition;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 15:27
 */

// 调味料
public class Mocha  extends Condiment{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescripton() {
        return  beverage.getDescripton() + ",Mocha";
    }

    @Override
    public double cost() {
        return 0.8 + beverage.cost();
    }
}


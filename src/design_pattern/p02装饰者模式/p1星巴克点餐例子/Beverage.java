package design_pattern.p02装饰者模式.p1星巴克点餐例子;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 15:20
 */

// 饮料
public abstract class Beverage {
    String descripton = "unknown";

    public String getDescripton() {
        return descripton;
    }

    public abstract double cost();
}


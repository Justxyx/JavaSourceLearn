package design_pattern.p02装饰者模式.p1星巴克点餐例子;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 15:24
 */

// 基础类型咖啡
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.descripton = "HouseBlend";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}


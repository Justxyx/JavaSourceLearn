package design_pattern.p13符合模式.p3工厂;

import design_pattern.p13符合模式.p1一个符合模式.*;

/**
 * @author xm
 * @date 2021/9/18 12:44
 * @description:
 */
public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createReaDuck() {
        return new RedDuck();
    }

    @Override
    public Quackable createBlueDuck() {
        return new BlueDuck();
    }

    @Override
    public Quackable createBlackDuck() {
        return new BlackDuck();
    }

    @Override
    public Quackable createGreenDuck() {
        return new GreenDuck();
    }
}


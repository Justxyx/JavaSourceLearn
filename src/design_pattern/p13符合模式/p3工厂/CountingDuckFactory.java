package design_pattern.p13符合模式.p3工厂;

import design_pattern.p13符合模式.p1一个符合模式.BlackDuck;
import design_pattern.p13符合模式.p1一个符合模式.GreenDuck;
import design_pattern.p13符合模式.p1一个符合模式.Quackable;
import design_pattern.p13符合模式.p1一个符合模式.RedDuck;
import design_pattern.p13符合模式.p2加一个装饰者.QuackCounter;

/**
 * @author xm
 * @date 2021/9/18 12:45
 * @description:
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createReaDuck() {
        return new QuackCounter(new RedDuck());
    }

    @Override
    public Quackable createBlueDuck() {
        return new QuackCounter(new BlackDuck());
    }

    @Override
    public Quackable createBlackDuck() {
        return new QuackCounter(new BlackDuck());
    }

    @Override
    public Quackable createGreenDuck() {
        return new QuackCounter(new GreenDuck());
    }
}


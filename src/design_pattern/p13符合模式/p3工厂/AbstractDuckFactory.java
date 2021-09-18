package design_pattern.p13符合模式.p3工厂;

import design_pattern.p13符合模式.p1一个符合模式.Quackable;

/**
 * @author xm
 * @date 2021/9/18 12:39
 * @description:
 *      再加一层 只用用工厂模式来管理生成的count 鸭子。
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createReaDuck();
    public abstract Quackable createBlueDuck();
    public abstract Quackable createBlackDuck();
    public abstract Quackable createGreenDuck();
}


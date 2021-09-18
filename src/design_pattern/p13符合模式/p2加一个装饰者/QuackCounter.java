package design_pattern.p13符合模式.p2加一个装饰者;

import design_pattern.p13符合模式.p1一个符合模式.Quackable;

/**
 * @author xm
 * @date 2021/9/18 12:00
 * @description:
 *      如果我要统计所有鸭子的叫声次数 怎么做呢 ？
 */
public class QuackCounter implements Quackable {
    private Quackable duck;
    static int count = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        count ++;
    }

    public static int getCount() {
        return count;
    }
}


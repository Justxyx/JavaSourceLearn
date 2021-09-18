package design_pattern.p13符合模式.p2加一个装饰者;

import design_pattern.p13符合模式.p1一个符合模式.*;

/**
 * @author xm
 * @date 2021/9/18 12:02
 * @description:
 */
public class Test01 {
    public static void main(String[] args) {


        System.out.println("------------");
        Test01 test = new Test01();
        test.simulate();
        int count = QuackCounter.getCount();
        System.out.println(count);
    }

    void simulate(){
        Quackable duck = new RedDuck();
        Quackable  blackDuck = new BlackDuck();
        Quackable greenDuck = new GreenDuck();
        Quackable blueDuck = new BlueDuck();

        Quackable quackCounter = new QuackCounter(duck);
        Quackable quackCounter1 = new QuackCounter(blackDuck);
        Quackable quackCounter2 = new QuackCounter(greenDuck);
        Quackable quackCounter3 = new QuackCounter(blueDuck);
        simulate(quackCounter);
        simulate(quackCounter1);
        simulate(quackCounter3);
        simulate(quackCounter2);

    }
    void simulate(Quackable q){
        q.quack();
    }
}


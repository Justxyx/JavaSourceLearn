package design_pattern.p13符合模式.p1一个符合模式;

/**
 * @author xm
 * @date 2021/9/18 11:12
 * @description:
 * 类似与命令模式
 */
public class Test01 {
    public static void main(String[] args) {
        Test01 test = new Test01();
        test.simulator();
    }

    void simulator(){
        Quackable blackDuck = new BlackDuck();
        Quackable redDuck = new RedDuck();
        Quackable greenDuck = new GreenDuck();
        Quackable blackDuck1 = new BlackDuck();

        System.out.println("=================");
        simulator(blackDuck);
        simulator(redDuck);
        simulator(greenDuck);
        simulator(blackDuck);
    }

    void simulator(Quackable duck){
        duck.quack();
        System.out.println("");
    }
}


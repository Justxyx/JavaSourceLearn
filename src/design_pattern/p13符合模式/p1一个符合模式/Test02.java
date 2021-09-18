package design_pattern.p13符合模式.p1一个符合模式;

/**
 * @author xm
 * @date 2021/9/18 11:12
 * @description:
 * 适配器模式
 */
public class Test02 {
    public static void main(String[] args) {
        Test02 test = new Test02();
        test.simulator();
    }

    void simulator(){
        Quackable blackDuck = new BlackDuck();
        Quackable redDuck = new RedDuck();
        Quackable greenDuck = new GreenDuck();
        Quackable blueDuck = new BlueDuck();
        Goose goose = new Goose();
        Quackable gooseAdapter = new GooseAdapter(goose);
        System.out.println("=================");
        simulator(blackDuck);
        simulator(redDuck);
        simulator(greenDuck);
        simulator(blueDuck);
        simulator(gooseAdapter);
    }

    void simulator(Quackable duck){
        duck.quack();
        System.out.println("");
    }
}


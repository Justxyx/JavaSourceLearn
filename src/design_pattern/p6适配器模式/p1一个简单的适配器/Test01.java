package design_pattern.p6适配器模式.p1一个简单的适配器;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/14 14:34
 */
public class Test01 {
    public static void main(String[] args) {
        Duck duck = new ADuck();
        duck.fly();
        duck.quack();
        System.out.println("---------------");

        Chicken chicken = new AChicken();
        chicken.cry();
        chicken.fly();
        System.out.println("--------------");

        ChickenAdapter chickenAdapter = new ChickenAdapter(chicken);
        chickenAdapter.quack();
        chickenAdapter.fly();

        Duck[] ducks = new Duck[5];
        ducks[0] = duck;
        ducks[1] = chickenAdapter;


    }
}


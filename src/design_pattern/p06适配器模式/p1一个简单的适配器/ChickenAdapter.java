package design_pattern.p06适配器模式.p1一个简单的适配器;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/14 14:33
 */
public class ChickenAdapter implements Duck {

    Chicken chicken;



    public ChickenAdapter(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public void quack() {
        chicken.cry();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 3; i++) {
            chicken.fly();
        }
    }
}


package design_pattern.p06适配器模式.p1一个简单的适配器;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/14 14:30
 */
public class ADuck implements Duck {
    @Override
    public void quack() {
        System.out.println("鸭子叫");
    }

    @Override
    public void fly() {
        System.out.println("小鸭子飞飞飞");
    }
}


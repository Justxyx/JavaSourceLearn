package design_pattern.p06适配器模式.p1一个简单的适配器;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/14 14:32
 */
public class AChicken implements Chicken {
    @Override
    public void cry() {
        System.out.println("小鸡叫叫叫");
    }

    @Override
    public void fly() {
        System.out.println("小鸡飞飞飞");
    }
}


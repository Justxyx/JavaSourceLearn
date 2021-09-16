package design_pattern.p02装饰者模式.p2装饰者模式再详解;

/**
 * @author xm
 * @date 2021/9/14 15:50
 * @description:
 */
public class Test01 {
    public static void main(String[] args) {
//        两颗红宝石，一颗蓝宝石的武器
        Equi decorator = new RedDecorator(new RedDecorator(new BlueDecorator(new Arms())));
        System.out.println(decorator.description());
        System.out.println(decorator.caculateAttack());
    }
}


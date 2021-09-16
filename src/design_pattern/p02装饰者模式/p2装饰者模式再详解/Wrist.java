package design_pattern.p02装饰者模式.p2装饰者模式再详解;

/**
 * @author xm
 * @date 2021/9/14 15:37
 * @description:
 */
public class Wrist implements Equi {
    @Override
    public int caculateAttack() {
        return 10;
    }

    @Override
    public String description() {
        return "这是一个护腕";
    }
}


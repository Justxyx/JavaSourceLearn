package design_pattern.p2装饰者模式.p2装饰者模式再详解;

/**
 * @author xm
 * @date 2021/9/14 15:32
 * @description:
 */
public class Arms implements Equi {
    @Override
    public int caculateAttack() {
        return 15;
    }

    @Override
    public String description() {
        return "这是一个武器";
    }
}


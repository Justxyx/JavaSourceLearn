package design_pattern.p2装饰者模式.p2装饰者模式再详解;

/**
 * @author xm
 * @date 2021/9/14 15:41
 * @description:
 */
public class GreenDecorator implements EquiDecorator {

    private Equi equi;


    public GreenDecorator(Equi equi) {
        this.equi = equi;
    }


    @Override
    public int caculateAttack() {
        return 6 + equi.caculateAttack();
    }

    @Override
    public String description() {
        return equi.description() +  ",这是一颗绿宝石" ;
    }
}


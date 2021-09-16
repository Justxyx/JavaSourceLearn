package design_pattern.p02装饰者模式.p2装饰者模式再详解;

/**
 * @author xm
 * @date 2021/9/14 15:41
 * @description:
 */
public class RedDecorator implements EquiDecorator {

    private Equi equi;


    public RedDecorator(Equi equi) {
        this.equi = equi;
    }


    @Override
    public int caculateAttack() {
        return 5 + equi.caculateAttack();
    }

    @Override
    public String description() {
        return equi.description() +  ",这是一颗红宝石" ;
    }
}


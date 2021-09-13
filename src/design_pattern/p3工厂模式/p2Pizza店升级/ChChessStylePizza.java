package design_pattern.p3工厂模式.p2Pizza店升级;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 18:18
 */
public class ChChessStylePizza extends Pizza{
    public ChChessStylePizza() {
        name = "zzz";
    }

    @Override
    void cut() {
        System.out.println("Chicago cut is different");
    }
}


package design_pattern.p2装饰者模式.p1星巴克点餐例子;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 15:30
 */
public class Test01 {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
//        加两个mocha
        Mocha mocha = new Mocha(espresso);

        System.out.println(mocha);

        System.out.println(espresso.getDescripton());
        System.out.println("---------");
        System.out.println(espresso.cost());
    }
}


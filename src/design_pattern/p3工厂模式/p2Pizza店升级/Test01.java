package design_pattern.p3工厂模式.p2Pizza店升级;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 18:33
 */
public class Test01 {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        CHPizzaStore chPizzaStore = new CHPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("chess");
        Pizza chess = chPizzaStore.orderPizza("chess");

    }
}


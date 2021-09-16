package design_pattern.p03工厂模式.p1简单工厂;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 17:34
 */
public class Test02 {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();

        PizzaStore pizzaStore = new PizzaStore(factory);
        Pizza pizza = pizzaStore.orderPizza("chess");

    }
}


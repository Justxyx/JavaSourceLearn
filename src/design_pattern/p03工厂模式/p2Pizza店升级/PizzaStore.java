package design_pattern.p03工厂模式.p2Pizza店升级;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 18:13
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);
        pizza.papre();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}


package design_pattern.p03工厂模式.p1简单工厂;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 17:30
 */
public class SimplePizzaFactory {
    Pizza pizza = null;

    public Pizza creaatePizza(String type){
        if (type.equalsIgnoreCase("chess")){
            pizza = new ChessPizza();
        }else if (type.equalsIgnoreCase("greek")){
            pizza = new GreekPizza();
        }

        return pizza;
    }


}


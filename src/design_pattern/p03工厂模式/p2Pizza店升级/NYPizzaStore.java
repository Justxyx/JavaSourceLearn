package design_pattern.p03工厂模式.p2Pizza店升级;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 18:30
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("chess")){
            return new NYChessStylePizza();
        }else {
            return null;
        }
    }
}


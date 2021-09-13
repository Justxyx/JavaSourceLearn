package design_pattern.p3工厂模式.p2Pizza店升级;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 18:32
 */
public class CHPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("chess")){
            return new ChChessStylePizza();
        }else {
            return null;
        }
    }
}


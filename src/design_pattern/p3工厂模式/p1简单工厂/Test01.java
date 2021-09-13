package design_pattern.p3工厂模式.p1简单工厂;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 17:23
 */

/**
 * 为什么不直接把pizza对象当作参数传到函数里？
 */
public class Test01 {
    public static void main(String[] args) {
        String type = "Chess";
        Pizza pizza = orderPiaaz(type);
    }

    private static Pizza orderPiaaz(String type) {
        Pizza pizza = null;

        if (type.equalsIgnoreCase("chess")){
            pizza = new ChessPizza();
        }else if (type.equalsIgnoreCase("greek")){
            pizza = new GreekPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.bake();

        return pizza;
    }
}


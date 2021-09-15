package design_pattern.p8模板方法.p1冲一杯咖啡吧;

/**
 * @author xm
 * @date 2021/9/15 10:48
 * @description:
 *      把茶跟咖啡抽象一个父类
 *      模式的核心是把算法模块只存在与父类
 *      修改方便
 */
public abstract class CaffeeBeverage {
    final void prepareRecipe(){
        boilWater();
        A();
        pourInCup();
        addA();
    }

    public abstract void addA();

    private void pourInCup() {
        System.out.println("倒进杯子");
    }

    private void boilWater() {
        System.out.println("烧水");
    }

    abstract void A();



}


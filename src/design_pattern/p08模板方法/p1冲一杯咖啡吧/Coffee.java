package design_pattern.p08模板方法.p1冲一杯咖啡吧;

/**
 * @author xm
 * @date 2021/9/15 10:42
 * @description:
 * 咖啡类
 */
public class Coffee {
    void prepareRecipe(){
        boilWater();
        A();
        pourInCup();
        addA();

    }

    private void addA() {
        System.out.println("add milk");
    }

    private void pourInCup() {
        System.out.println("put into a cup");
    }

    private void A() {
        System.out.println("冲泡咖啡");
    }

    private void boilWater() {
        System.out.println("烧水");
    }
}


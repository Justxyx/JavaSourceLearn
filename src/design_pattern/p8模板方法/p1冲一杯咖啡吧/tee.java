package design_pattern.p8模板方法.p1冲一杯咖啡吧;

/**
 * @author xm
 * @date 2021/9/15 10:42
 * @description:
 * 咖啡类
 */
public class tee {
    void prepareRecipe(){
        boilWater();
        B();
        pourInCup();
        addB();

    }

    private void B() {
        System.out.println("浸泡茶");
    }

    private void addB() {
        System.out.println("add lemon");
    }

    private void pourInCup() {
        System.out.println("put into a cup");
    }


    private void boilWater() {
        System.out.println("烧水");
    }
}


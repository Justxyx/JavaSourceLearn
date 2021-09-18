package design_pattern.p13符合模式.p3工厂;

/**
 * @author xm
 * @date 2021/9/18 12:52
 * @description:
 */
public class Test01 {
    public static void main(String[] args) {
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        simulaotr(countingDuckFactory);
    }

    private static void simulaotr(AbstractDuckFactory countingDuckFactory) {
        countingDuckFactory.createBlackDuck().quack();
        countingDuckFactory.createBlueDuck().quack();
        countingDuckFactory.createGreenDuck().quack();
        countingDuckFactory.createReaDuck().quack();
    }


}


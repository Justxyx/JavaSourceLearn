package design_pattern.p08模板方法.p3模板方法模式再详解;

/**
 * @author xm
 * @date 2021/9/15 16:24
 * @description:
 */
public class Test01 {
    public static void main(String[] args) {
        Boss xyx = new Boss("xyx");
        xyx.workForADay();
        System.out.println("============");
        ITWorker zzz = new ITWorker("zzz");
        zzz.workForADay();
    }
}


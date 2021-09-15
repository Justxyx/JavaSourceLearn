package design_pattern.p8模板方法.p1冲一杯咖啡吧;

/**
 * @author xm
 * @date 2021/9/15 10:53
 * @description:
 *      抽象不同的方法 继承相同的方法 提取公共父类
 */
public class Test01 {
    public static void main(String[] args) {
        ACaffee aCaffee = new ACaffee();
        aCaffee.prepareRecipe();
    }
}


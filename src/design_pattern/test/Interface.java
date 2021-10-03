package design_pattern.test;

/**
 * @author xm
 * @date 2021/9/22 16:39
 * @description:
 */
public interface Interface {
    default void method1(){
        System.out.println("这是一个接口默认方法");
    }
    static void method2(){
        System.out.println("这是一个接口的静态方法");
    }
}

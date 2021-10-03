package java_base.p2接口问题;

/**
 * @author xm
 * @date 2021/9/28 14:28
 * @description:
 */
public interface Inter {
    public static final int i = 3;

    int j = 3;


    void method1();

    // 默认方法
    default void method2(){
        System.out.println("method2 ..  默认方法");
    }

    static void method3(){
        System.out.println("this is a static method");
    }
}

package design_pattern.test;

/**
 * @author xm
 * @date 2021/9/22 16:46
 * @description:
 * 接口中的默认方法
 */
public interface IterfaceA {
    default void method(){
        System.out.println("这是一个接口的默认方法");
    }

    abstract void mehtod2();

    static void method3(){
        System.out.println("接口默认静态方法");
    }
}


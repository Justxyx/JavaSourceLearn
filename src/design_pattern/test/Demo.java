package design_pattern.test;

/**
 * @author xm
 * @date 2021/9/22 17:00
 * @description:
 */
public interface Demo {
    void method();

    default void start(){
        method();
    }
}

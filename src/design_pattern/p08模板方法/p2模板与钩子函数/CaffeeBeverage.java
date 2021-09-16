package design_pattern.p08模板方法.p2模板与钩子函数;

/**
 * @author xm
 * @date 2021/9/15 12:09
 * @description:
 */
public abstract class CaffeeBeverage {
    final void process(){
        method1();
        method2();
        method3();
        if (hock()){
            method4();
        }
    }

    abstract void method4();

    boolean hock(){
        return true;
    }

    abstract void method3() ;

    private void method2() {
        System.out.println("实现了方法2");
    }

    private void method1() {
        System.out.println("实现了方法1");
    }
}


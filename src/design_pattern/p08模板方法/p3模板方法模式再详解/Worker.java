package design_pattern.p08模板方法.p3模板方法模式再详解;

import java.util.Date;

/**
 * @author xm
 * @date 2021/9/15 14:52
 * @description:
 *      所有员工的父类
 */
public abstract class Worker {
    protected String name;

    public Worker(String name) {
        this.name = name;
    }

    final void workForADay(){
        method1();
        method2();
        method5();
        method3();
        method4();
    }

    // 加入钩子函数
    protected boolean hock(){
        return false;
    }

    protected abstract void method5();


    private  void method1(){
        System.out.println(name + ":已经进入公司了");
    }
    private  void method2(){
        System.out.println(name + ":打开了电脑");
    }
    private  void method3(){
        System.out.println(name + ":关闭电脑");
    }
    private  void method4(){
        if (hock()){
            System.out.println(name + ":" + new Date().toString() + "离开了公司");
        }else {
            System.out.println(name + ":离开公司");
        }
    }
}


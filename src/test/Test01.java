package test;

import java.util.Arrays;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/13 12:09
 */
public abstract class Test01 {
    private String name;
    private String pwd;

     Test01(){
         System.out.println("父类构造函数");
    }

    abstract void method1(); // 抽象方法一

    public Test01(String name, String pwd) {
        this.name = "xxx";
        this.pwd = "yyy";
    }

    void method2(){
        System.out.println(name);
        System.out.println(pwd);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = 3;
        }
        Arrays.sort(a);
    }
}


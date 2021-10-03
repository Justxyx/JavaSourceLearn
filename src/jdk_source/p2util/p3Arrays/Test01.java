package jdk_source.p2util.p3Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author xm
 * @date 2021/9/18 15:05
 * @description:
 *      之前还没太注意，jkd 内置arrays
 *      Arrays 不可以被实例化  构造函数未private
 */
public class Test01 {
    public static void main(String[] args) {

//        method1();   // asList
//        method2();    // sort
//        method3();    // binarySearch  二分法查找
//        method4();      // copy 方法 底层native方法
        method5();
    }

    private static void method5() {

        int[] a = {1,3,4};

        Arrays.equals(a,a);
        System.out.println(a.toString());
        System.out.println("---------");
        System.out.println(Arrays.toString(a));

    }

    private static void method4() {
        int[] array = {1,2,3};
        int[] ints = Arrays.copyOf(array, 10);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    private static void method3() {
        /**
         * 这个算法还挺逗的其实
         *      以前刚学数据结构天天在写二分查找
         *      jdk 里面直接把二分查找算法给封装好了
         *      先sort 排序 再二分查找
         *      二分查找只针对有序数组
         */
        int[] array = {1,2,3};
        int i = Arrays.binarySearch(array, 2);
        System.out.println(i);
    }

    private static void method2() {
        /**
         * sort 方法有很多重载，点进源码看看就可以了。
         * 可以指定顺序  哪几位到哪几位重排序
         * 排序算法用的是快排 DualPivotQuicksort
         * 留个小坑吧 以后有空看看
         */
        int[] array = {1,31,41,12,5,6,22};
        Arrays.sort(array);
        Arrays.sort(array,1,3);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void method1() {
        /**
         * asList  没有 add 与 remove 方法
         */
        List<String> strings = Arrays.asList("jack", "tom", "rose");
//        boolean xx = strings.add("xx");
    }
}


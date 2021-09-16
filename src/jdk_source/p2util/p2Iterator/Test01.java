package jdk_source.p2util.p2Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author xm
 * @date 2021/9/16 16:59
 * @description:
 */
public class Test01 {
    public static void main(String[] args) {
        method1();   // iterator定义
    }


    private static void method1() {
        /**
         *  Iterator 在java.util 包下
         *      泛型接口
         *      interface Iterator<T>{
         *      boolean hasNext();
         *      T next();
         *      }
         */
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 数组不可用迭代器
        int[] arry = new int[5];

    }
}


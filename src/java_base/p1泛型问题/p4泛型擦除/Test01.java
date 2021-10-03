package java_base.p1泛型问题.p4泛型擦除;

import java.util.ArrayList;

/**
 * @author xm
 * @date 2021/9/27 16:29
 * @description:
 */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList<>();

        System.out.println(list1.getClass());  //class java.util.ArrayList
        System.out.println(list2.getClass());  //class java.util.ArrayList
    }
}


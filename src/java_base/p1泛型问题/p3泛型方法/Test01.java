package java_base.p1泛型问题.p3泛型方法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xm
 * @date 2021/9/27 16:14
 * @description:
 */
public class Test01 {
    public static void main(String[] args) {

    }


    <T> T method1(T t){
        return t;
    }

    <T> void method2(T t){
        return;
    }

    <T> List<T> method3(T t){
        return new ArrayList<T>();
    }
}


package jdk_source.p2util.p4容器.p1ArryList;

import java.util.ArrayList;

/**
 * @author xm
 * @date 2021/9/27 15:39
 * @description:
 * ArrayList 自动扩容问题
 *      默认初始的大小为10 添加元素时发现容量已满 会自动扩容1.5倍
 */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(2);
        list.add(1);
        list.add(1);
        list.add(1);
    }
}


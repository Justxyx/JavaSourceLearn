package java_base.p1泛型问题.p1泛型类;

import design_pattern.test.Test;

/**
 * @author xm
 * @date 2021/9/27 15:46
 * @description:
 */
public class Test01 {
    public static void main(String[] args) {
        /**
         * 无泛型类
         */
        Info info = new Info();
        info.setName("xx");

        /**
         * 单参数泛型类
         */
        InfoT<Integer> infoT = new InfoT<>();
        infoT.setName(1);

        /**
         * 多参数泛型类，
         * 以两个举例
         */
        InfoKV<String, Integer> kv = new InfoKV<>();
        kv.setVv(1);


        /**
         * 泛型嵌套问题
         */
        InfoKV<InfoT<String>, Object> objectObjectInfoKV = new InfoKV<>();


    }
}


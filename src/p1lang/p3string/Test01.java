package p1lang.p3string;

import java.util.Objects;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/9 19:50
 */
public class Test01 {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        /**
         * public final class String
         implements java.io.Serializable, Comparable<String>, CharSequence{}
         一旦创建，不可更改，不可继承 直至销毁
         */

        //1.构造方法与hashcode
        test01();

        //2. 说明，重写类的equals方法为什么要重写hashcode方法？
        test02();
    }

    private static void test02() {
        /**
         * 突然想起来一点，重写类的equals方法为什么要重写hashcode方法？
         * 下面的例子就已经可以说明白了
         * 直白点说，equals方法只简单的比较对象的值域是否相等
         * 而HashMap 等容器添加对象时，不可能每个挨着比较 只比较hashcode值即可
         */

        // 重写hashcode方法
        hashCodeTest t1 = new hashCodeTest("1", "2");  // 2530
        System.out.println(t1.hashCode());
        System.out.println("----------");
        hashCodeTest t2 = new hashCodeTest("1", "2");  // 2530
        System.out.println(t2.hashCode());

        // 未重写hashcode方法
        System.out.println("==========================");
        hashCodeTest t3 = new hashCodeTest("1", "2");  // 460141958
        System.out.println(t1.hashCode());
        System.out.println("----------");
        hashCodeTest t4 = new hashCodeTest("1", "2");  // 1163157884
        System.out.println(t2.hashCode());
    }

    private static void test01() {
        String s = new String("134");
        System.out.println(s.hashCode());   // 48722

        String str = "142rrx";
        System.out.println(str.hashCode());    // 1452454249

    }

    static class hashCodeTest{
        private String t1;
        private String t2;

        public hashCodeTest(String t1, String t2) {
            this.t1 = t1;
            this.t2 = t2;
        }

        // 重写hashcode方法
//        @Override
//        public int hashCode() {
//            return Objects.hash(t1,t2);
//        }
    }
}


package p1lang.p2integer;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/9 18:23
 */
public class Test01 {
    public static void main(String[] args) {
        // 1.自动装箱拆箱问题
        test1();

        // 2.euqls
        test2();

        // 3. Integer 继承 Number 与 Comparable 接口
        new Test3();

        //4. Number 继承 Serializable接口，Integer类可序列化

    }

    static class Test3 extends Number{
        @Override
        public int intValue() {
            return 0;
        }

        @Override
        public long longValue() {
            return 0;
        }

        @Override
        public float floatValue() {
            return 0;
        }

        @Override
        public double doubleValue() {
            return 0;
        }
    }

    private static void test2() {
        Integer i = 3;
        System.out.println(i.equals(3));
    }

    private static void test1() {
//        装箱问题
        Integer i = 3;     // Integer i = new Intteger(3)  -128 到 127 之间的数是直接调用IntergerCache缓存得到的
        /**
         public static Integer valueOf(int i) {
         if (i >= IntegerCache.low && i <= IntegerCache.high)
         return IntegerCache.cache[i + (-IntegerCache.low)];
         return new Integer(i);
         }
          */
        int i1 = Integer.parseInt("3");


        // 拆箱问题
        int j ;
        Integer integer = new Integer(3);
        j = integer;
        j = integer.intValue();
        /**
         * 自动调用拆箱发法
         *     public int intValue() {
         return value;
         }
         */

     }
}


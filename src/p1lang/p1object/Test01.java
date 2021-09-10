package p1lang.p1object;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/9 16:39
 */
public class Test01 {
    public static void main(String[] args) {
        Object o = new Object();
    }
}

/**
 * 所有父类的顶类
 * 笔记：
 *      Object 源码里面没有啥方法也。最重要的一个方法就是：
 *              public boolean equals(Object obj) {
                    return (this == obj);
 }
 */

/**
 * 再补充一点，关于Object方法的hashcode方法：
 *      public native int hashCode();
 *      该方法返回一个int类型的数值，并且是本地方法，因此在Object类中并没有给出具体的实现。
 *      1、如果两个对象相同，那么它们的hashCode值一定要相同；
 *      2、如果两个对象的hashCode相同，它们并不一定相同     上面说的对象相同指的是用eqauls方法比较。
 */


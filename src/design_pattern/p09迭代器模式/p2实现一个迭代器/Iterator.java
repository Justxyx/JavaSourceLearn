package design_pattern.p09迭代器模式.p2实现一个迭代器;

/**
 * @author xm
 * @date 2021/9/16 16:41
 * @description:
 *      构造器接口
 */
public interface Iterator {
    boolean hasNext();
    Object next();
}


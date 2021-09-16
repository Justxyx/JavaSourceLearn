package design_pattern.p09迭代器模式.p1一个简单的点餐;

/**
 * @author xm
 * @date 2021/9/16 14:23
 * @description:
 */
public class MenuB {
    Food[] foods;

    public Iterator createIterator(){
        return new BarBIterator(foods);
    }
}


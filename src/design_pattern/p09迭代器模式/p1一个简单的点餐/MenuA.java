package design_pattern.p09迭代器模式.p1一个简单的点餐;

import java.util.ArrayList;

/**
 * @author xm
 * @date 2021/9/16 14:23
 * @description:
 */
public class MenuA {
    ArrayList list;

    public MenuA(ArrayList list) {
        this.list = list;
    }

    public Iterator createIterator(){
        return new BarAIterator(list);
    }
}


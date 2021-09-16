package design_pattern.p9迭代器模式.p1一个简单的点餐;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xm
 * @date 2021/9/16 11:59
 * @description:
 */
public class BarAIterator implements Iterator {
    ArrayList list;
    int i = -1;

    public BarAIterator(ArrayList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (list.size() > i+1){
            return true;
        }else {
            return  false;
        }
    }

    @Override
    public Object next() {
        if (hasNext()){
            i ++;
            return list.get(i);
        }else {
            return null;
        }
    }
}


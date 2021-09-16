package design_pattern.p09迭代器模式.p1一个简单的点餐;

/**
 * @author xm
 * @date 2021/9/16 12:07
 * @description:
 */
public class BarBIterator implements Iterator {
    Food[] foods;
    int i = -1;

    public BarBIterator(Food[] foods) {
        this.foods = foods;
    }

    @Override
    public boolean hasNext() {
        if (foods.length >= i){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Object next() {
        if (hasNext()){
            i ++;
            return foods[i];
        }else {
            return false;
        }
    }
}


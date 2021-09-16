package design_pattern.p09迭代器模式.p2实现一个迭代器;

/**
 * @author xm
 * @date 2021/9/16 16:42
 * @description:
 */
public class IteratorImp implements Iterator {
    private int[] o;
    int i = 0;


    public IteratorImp(int[] o) {
        this.o = o;
    }



    @Override
    public boolean hasNext() {
        if (o.length > i){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Object next() {
        if (hasNext()){
            return o[i++];
        }else {
            return null;
        }
    }
}


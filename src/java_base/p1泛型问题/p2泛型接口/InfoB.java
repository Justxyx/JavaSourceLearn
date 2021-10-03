package java_base.p1泛型问题.p2泛型接口;

/**
 * @author xm
 * @date 2021/9/27 16:09
 * @description:
 */
public class InfoB<T> implements InfoT<T> {
    private T name;

    public InfoB(T name) {
        this.name = name;
    }

    @Override
    public T method2() {
        return name;
    }
}


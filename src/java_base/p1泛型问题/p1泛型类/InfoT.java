package java_base.p1泛型问题.p1泛型类;

/**
 * @author xm
 * @date 2021/9/27 15:46
 * @description:
 */
public class InfoT<T> {
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public InfoT(T name) {
        this.name = name;
    }

    public InfoT() {
    }
}


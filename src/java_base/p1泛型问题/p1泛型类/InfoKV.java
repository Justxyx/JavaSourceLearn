package java_base.p1泛型问题.p1泛型类;

/**
 * @author xm
 * @date 2021/9/27 15:51
 * @description:
 */
public class InfoKV<K,V> {
    private String name;
    private K kk;
    private V vv;


    public InfoKV(K kk, V vv) {
        this.kk = kk;
        this.vv = vv;
    }

    public InfoKV() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public K getKk() {
        return kk;
    }

    public void setKk(K kk) {
        this.kk = kk;
    }

    public V getVv() {
        return vv;
    }

    public void setVv(V vv) {
        this.vv = vv;
    }
}


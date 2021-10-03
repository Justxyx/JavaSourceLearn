package java_base.p1泛型问题.p2泛型接口;

/**
 * @author xm
 * @date 2021/9/27 16:04
 * @description:
 *      子类实现接口直接明确泛型类型
 */
public class InfoA implements InfoT<Integer>{
    @Override
    public Integer method2() {
        System.out.println("直接实现");
        return 22;
    }
}


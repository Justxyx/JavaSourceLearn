package design_pattern.p8模板方法.p3模板方法模式再详解;

/**
 * @author xm
 * @date 2021/9/15 16:19
 * @description:
 */
public class Boss extends Worker {
    public Boss(String name) {
        super(name);
    }

    @Override
    protected boolean hock() {
        return true;
    }

    @Override
    protected void method5() {
        System.out.println("------------");
        System.out.println(name +":老板来上班视察公司了");
        System.out.println("------------");
    }
}


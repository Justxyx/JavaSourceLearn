package design_pattern.p08模板方法.p3模板方法模式再详解;

/**
 * @author xm
 * @date 2021/9/15 16:19
 * @description:
 */
public class ITWorker extends Worker {
    public ITWorker(String name) {
        super(name);
    }

    @Override
    protected boolean hock() {
        return false;
    }

    @Override
    protected void method5() {
        System.out.println("------------");
        System.out.println(name + ":来做开发工作了");
        System.out.println("------------");
    }
}


package design_pattern.p11状态模式.p3一个比较好理解的例子.重构;

/**
 * @author xm
 * @date 2021/9/17 12:01
 * @description:
 */
public class Open implements State {
    private Elevator elevator;

    public Open(Elevator elevator) {
        this.elevator = elevator;
    }
    @Override
    public void open() {
        System.out.println("门已经是开了");
    }

    @Override
    public void closed() {
        System.out.println("关门嘞");

    }

    @Override
    public void run() {
        System.out.println("开门不能运行");

    }

    @Override
    public void stop() {
        System.out.println("已经停止了");

    }
}


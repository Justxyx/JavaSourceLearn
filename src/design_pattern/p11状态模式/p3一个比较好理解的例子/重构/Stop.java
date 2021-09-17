package design_pattern.p11状态模式.p3一个比较好理解的例子.重构;

/**
 * @author xm
 * @date 2021/9/17 12:01
 * @description:
 */
public class Stop implements State {
    private Elevator elevator;

    public Stop(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void open() {

    }

    @Override
    public void closed() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}


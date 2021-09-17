package design_pattern.p11状态模式.p3一个比较好理解的例子.重构;

/**
 * @author xm
 * @date 2021/9/17 12:01
 * @description:
 */
public class Closed implements State {
    private Elevator elevator;

    public Closed(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void open() {
        System.out.println("open ");
    }

    @Override
    public void closed() {
        System.out.println(" close ");
    }

    @Override
    public void run() {
        System.out.println(" is runing ");
    }

    @Override
    public void stop() {
        System.out.println("is stop");
    }
}


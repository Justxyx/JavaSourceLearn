package design_pattern.p11状态模式.p3一个比较好理解的例子.重构;

/**
 * @author xm
 * @date 2021/9/17 12:01
 * @description:
 */
public class Run implements State {
    private Elevator elevator;

    public Run(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void open() {
        System.out.println(" cant");
    }

    @Override
    public void closed() {
        System.out.println("is closed");
    }

    @Override
    public void run() {
        System.out.println("is run");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}


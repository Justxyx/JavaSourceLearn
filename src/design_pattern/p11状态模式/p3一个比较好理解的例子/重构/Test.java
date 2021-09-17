package design_pattern.p11状态模式.p3一个比较好理解的例子.重构;

/**
 * @author xm
 * @date 2021/9/17 12:16
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        elevator.closed();
        elevator.run();
        elevator.stop();
    }
}


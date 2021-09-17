package design_pattern.p11状态模式.p3一个比较好理解的例子;

/**
 * @author xm
 * @date 2021/9/17 11:55
 * @description:
 *      两个问题：
 *             1. 代码冗余，
 *             2. 新加一个状态怎么办 ？
 */
public class Test01 {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(2);

        lift.run();
        lift.stop();
        lift.open();
    }
}


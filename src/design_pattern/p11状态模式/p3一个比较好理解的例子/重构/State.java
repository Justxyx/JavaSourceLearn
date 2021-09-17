package design_pattern.p11状态模式.p3一个比较好理解的例子.重构;

/**
 * @author xm
 * @date 2021/9/17 11:59
 * @description:
 *      电梯运行的四种状态
 *      把每个状态都封装起来即可
 */
public interface State {
    void open();
    void closed();
    void run();
    void stop();
}

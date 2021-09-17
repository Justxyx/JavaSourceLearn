package design_pattern.p11状态模式.p2代码重构;

/**
 * @author xm
 * @date 2021/9/17 9:54
 * @description:
 *      把动作跟状态分离
 *      四种动作如下
 */
public interface State {
    /**
     * 放钱
     */
    public void insertMoney();
    /**
     * 退钱
     */
    public void backMoney();
    /**
     * 转动曲柄
     */
    public void turnCrank();
    /**
     * 出商品
     */
    public void dispense();
}


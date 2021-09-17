package design_pattern.p11状态模式.p4自己来写一个;

/**
 * @author xm
 * @date 2021/9/17 9:54
 * @description:
 *      定义一个抽奖机，可以投币，退币 也可以 抽奖
 *      抽奖显示奖品是多样的
 *      奖品也是有库存的
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
     * 按下抽奖按钮
     */
    public void turnButton();
    /**
     * 出商品
     */
    public void display();
}


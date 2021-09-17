package design_pattern.p11状态模式.p4自己来写一个;

/**
 * @author xm
 * @date 2021/9/17 16:24
 * @description:
 */
public class Machine {
    private State hasMoney;   // 已经投币的状态
    private State noMoney;      // 未投币的状态
    private State onButton;     // 按下按钮开始摇奖的状态
    private State soldOut;      // 已经售罄的状态

    private int count;
    private State currentState;

    public Machine(int count) {
        this.count = count;
        hasMoney = new HasMoney(this);
        noMoney = new NoMoney(this);
        onButton = new OnButton(this);
        soldOut = new SoldOut(this);
        currentState = noMoney;
    }

    /**
     * 放钱
     *      任何状态下都可以投币
     */
    public void insertMoney(){

    }
    /**
     * 退钱
     */
    public void backMoney(){

    }
    /**
     * 按下抽奖按钮
     */
    public void turnButton(){

    }
    /**
     * 出商品
     */
    public void display(){

    }


}


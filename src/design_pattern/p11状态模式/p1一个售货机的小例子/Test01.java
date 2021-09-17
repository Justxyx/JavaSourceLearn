package design_pattern.p11状态模式.p1一个售货机的小例子;

/**
 * @author xm
 * @date 2021/9/17 9:39
 * @description:
 */
public class Test01 {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(5);
        vendingMachine.insertMoney();
        vendingMachine.backMoney();
        vendingMachine.insertMoney();

        vendingMachine.turnCrank();
    }
}


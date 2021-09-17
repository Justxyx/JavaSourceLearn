package design_pattern.p11状态模式.p2代码重构;

/**
 * @author xm
 * @date 2021/9/17 9:59
 * @description:
 */
public class NoMoneyState implements State {
    private VendingMachine machine;
    public NoMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("投币成功");
        machine.setState(machine.getHasMoneyState());
    }

    @Override
    public void backMoney() {
        System.out.println("您未投币，想退钱？...");
    }

    @Override
    public void turnCrank() {
        System.out.println("您未投币，想拿东西么？...");
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("非法状态！");
    }
}


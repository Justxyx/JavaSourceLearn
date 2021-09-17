package design_pattern.p11状态模式.p4自己来写一个;

/**
 * @author xm
 * @date 2021/9/17 16:27
 * @description:
 */
public class HasMoney  implements State{
    private Machine machine;

    public HasMoney(Machine machine) {
        this.machine = machine;
    }


    @Override
    public void insertMoney() {

    }

    @Override
    public void backMoney() {

    }

    @Override
    public void turnButton() {

    }

    @Override
    public void display() {

    }
}


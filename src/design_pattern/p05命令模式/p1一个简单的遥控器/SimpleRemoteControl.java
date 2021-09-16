package design_pattern.p05命令模式.p1一个简单的遥控器;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/14 9:43
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}


package design_pattern.p05命令模式.p1一个简单的遥控器;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/14 9:44
 */
public class Test01 {
    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand command = new LightOnCommand(light);
        control.setSlot(command);
        control.buttonWasPressed();
    }
}


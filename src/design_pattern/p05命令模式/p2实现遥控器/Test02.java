package design_pattern.p05命令模式.p2实现遥控器;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/14 11:40
 */
public class Test02 {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan("武汉");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);

        control.setCommand(1,ceilingFanHighCommand,null);

        control.onButtonWasPushed(1);
    }
}


package design_pattern.p05命令模式.p2实现遥控器;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/14 10:32
 */
public class Test01 {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        LightOnCommand onCommand = new LightOnCommand(light);
        LightOffCommand offCommand = new LightOffCommand(light);

        control.setCommand(0,onCommand,offCommand);

        System.out.println("===================");
        control.onButtonWasPushed(0);
//        System.out.println("-------------------");
//        control.offButtonWasPushed(0);
        System.out.println("------------------");
        control.onUndoButtonWasPushed();
    }
}


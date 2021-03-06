package design_pattern.p05命令模式.p2实现遥控器;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/14 10:30
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}


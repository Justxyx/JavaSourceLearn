package design_pattern.p5命令模式.p2实现遥控器;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/14 10:30
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}


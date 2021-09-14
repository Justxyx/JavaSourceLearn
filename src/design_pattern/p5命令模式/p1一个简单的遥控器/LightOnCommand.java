package design_pattern.p5命令模式.p1一个简单的遥控器;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/14 9:41
 */
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}


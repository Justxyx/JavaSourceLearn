package design_pattern.p5命令模式.p2实现遥控器;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/14 10:10
 */
public class noCommand implements Command {
    @Override
    public void execute() {
        System.out.println("no Command");
    }

    @Override
    public void undo() {
        System.out.println("undo");
    }
}


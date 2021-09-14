package design_pattern.p5命令模式.p2实现遥控器;

import javax.swing.*;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/14 11:46
 */
public class CeilingFanHighCommand implements Command {


    CeilingFan ceilingFan;
    int preSpeed;


    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        System.out.println("CeilingFan is on");
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (preSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        }else if(preSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        }else if(preSpeed == CeilingFan.LOW){
            ceilingFan.low();
        }else if(preSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}


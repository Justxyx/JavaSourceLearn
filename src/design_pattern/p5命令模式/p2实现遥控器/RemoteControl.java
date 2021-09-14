package design_pattern.p5命令模式.p2实现遥控器;

import java.util.Arrays;

/**
 * @author xm
 * @version 1.0
 * @date 2021/9/14 10:07
 */
public class RemoteControl {
     Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;


    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        noCommand noCommand = new noCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void onUndoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}


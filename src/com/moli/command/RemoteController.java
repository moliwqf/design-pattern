package com.moli.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author moli
 * @time 2024-02-23 16:08:36
 * @description 遥控器
 */
public class RemoteController {

    private final List<Command> onCommands;
    private final List<Command> offCommands;

    private static final int size = 5;

    private Command undoCommand;

    public RemoteController() {
        Command[] commands = new Command[size];
        Arrays.fill(commands, new NoCommand());
        onCommands = Arrays.asList(commands);
        offCommands = Arrays.asList(commands);
    }

    public void setCommand(int no, Command onCommand, Command offCommand) {
        if (no >= size) return;
        onCommands.set(no, onCommand);
        offCommands.set(no, offCommand);
    }

    public void btnPushed(int no) {
        onCommands.get(no).execute();
        undoCommand = offCommands.get(no);
    }

    public void btnReleased(int no) {
        offCommands.get(no).execute();
        undoCommand = onCommands.get(no);
    }

    public void undoBtnPushed() {
        undoCommand.undo();
        undoCommand = new NoCommand();
    }
}

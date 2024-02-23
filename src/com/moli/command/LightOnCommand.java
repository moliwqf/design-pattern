package com.moli.command;

/**
 * @author moli
 * @time 2024-02-23 16:04:36
 * @description 开灯命令
 */
public class LightOnCommand implements Command {

    private final LightReceiver receiver;

    public LightOnCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}

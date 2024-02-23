package com.moli.command;

/**
 * @author moli
 * @time 2024-02-23 16:06:38
 * @description 关灯操作
 */
public class LightOffCommand implements Command{

    private final LightReceiver receiver;

    public LightOffCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
}

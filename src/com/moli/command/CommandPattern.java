package com.moli.command;

import javax.management.monitor.StringMonitor;

/**
 * @author moli
 * @time 2024-02-23 16:02:01
 * @description 命令模式
 */
public class CommandPattern {

    public static void main(String[] args) {

        LightReceiver lightReceiver = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(0, lightOnCommand, lightOffCommand);


    }
}

package com.moli.command;

/**
 * @author moli
 * @time 2024-02-23 16:04:09
 * @description 命令
 */
public interface Command {

    void execute();

    void undo();
}

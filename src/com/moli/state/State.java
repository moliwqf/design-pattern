package com.moli.state;

/**
 * @author moli
 * @time 2024-02-23 22:43:36
 * @description 状态接口
 */
public abstract class State {

    public Activity activity;

    public State(Activity activity) {
        this.activity = activity;
    }

    public abstract void deduceMoney();

    public abstract void raffle();

    public abstract void dispensePrize();

}

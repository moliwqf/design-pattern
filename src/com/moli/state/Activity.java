package com.moli.state;

/**
 * @author moli
 * @time 2024-02-23 22:46:11
 * @description 活动
 */
public class Activity {

    public State curState = null;
    public int count;

    public State noRaffleState = new NoRaffleState(this);
    public State canRaffleState = new CanRaffleState(this);
    public State dispenseState = new DispenseState(this);

    public Activity() {
        curState = noRaffleState;
        count = 0;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }
}

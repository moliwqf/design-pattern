package com.moli.state;

/**
 * @author moli
 * @time 2024-02-23 22:45:13
 * @description 未抽奖
 */
public class NoRaffleState extends State {


    public NoRaffleState(Activity activity) {
        super(activity);
    }

    @Override
    public void deduceMoney() {
        System.out.println("deduceMoney");
    }

    @Override
    public void raffle() {
        System.out.println("抽奖中");
    }

    @Override
    public void dispensePrize() {

    }
}

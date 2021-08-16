package model;

import Command.impl.DepositCommand;
import Command.impl.ShowBalanceCommand;
import Command.impl.WithdrawCommand;

public class Person {
    private DepositCommand depositCommand;
    private ShowBalanceCommand showBalanceCommand;
    private WithdrawCommand withdrawCommand;

    public Person(DepositCommand depositCommand, ShowBalanceCommand showBalanceCommand, WithdrawCommand withdrawCommand) {
        this.depositCommand = depositCommand;
        this.showBalanceCommand = showBalanceCommand;
        this.withdrawCommand = withdrawCommand;
    }

    public void depositMoney(){
        depositCommand.execute();
    }

    public void withdrawMoney(){
        withdrawCommand.execute();
    }

    public void showMyBalance(){
        showBalanceCommand.execute();
    }

}

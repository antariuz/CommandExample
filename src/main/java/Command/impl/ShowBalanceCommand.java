package Command.impl;

import Command.Command;
import model.ATM;

public class ShowBalanceCommand implements Command {

    private ATM atm;

    public ShowBalanceCommand(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void execute() {
        atm.showBalance();
    }
}

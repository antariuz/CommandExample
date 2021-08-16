package Command.impl;

import Command.Command;
import model.ATM;

public class DepositCommand implements Command {

    private ATM atm;

    public DepositCommand(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void execute() {
        atm.deposit();
    }
}

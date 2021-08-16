package Command.impl;

import Command.Command;
import model.ATM;

public class WithdrawCommand implements Command {
    private ATM atm;

    public WithdrawCommand(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void execute() {
        atm.withdraw();
    }
}

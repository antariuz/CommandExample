import Command.impl.DepositCommand;
import Command.impl.ShowBalanceCommand;
import Command.impl.WithdrawCommand;
import model.ATM;
import model.Person;

public class CommandExample {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Person person = new Person(new DepositCommand(atm), new ShowBalanceCommand(atm), new WithdrawCommand(atm));
        person.depositMoney();
        person.withdrawMoney();
        person.showMyBalance();
    }
}

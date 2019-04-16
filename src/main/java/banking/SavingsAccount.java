package banking;

public class SavingsAccount extends AbstractAccount {

    @Override
    public boolean deposit(float amount) {
        setBalance(getBalance() + amount);
        return true;
    }

    @Override
    public boolean withdraw(float amount) {
        if (getBalance() - amount < 0) {
            return false;
        }
        setBalance(getBalance() - amount);
        return true;
    }
}

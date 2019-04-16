package banking;

public class SavingsAccount extends AbstractAccount {
    @Override
    public boolean deposit(double expected) {
        return false;
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public boolean withdraw(double v) {
        return false;
    }
}

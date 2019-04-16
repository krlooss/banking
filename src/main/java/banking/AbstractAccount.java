package banking;

public abstract class AbstractAccount {

    public abstract boolean deposit(double expected);

    public abstract double getBalance();

    public abstract boolean withdraw(double v);
}

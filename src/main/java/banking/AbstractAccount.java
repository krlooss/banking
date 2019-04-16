package banking;

public abstract class AbstractAccount {

    private float balance;

    public abstract boolean deposit(float expected);

    public abstract boolean withdraw(float amount);

    public float getBalance(){
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}

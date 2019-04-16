
package banking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SavingsAccountTest {
    private SavingsAccount savingsAccount;

    public SavingsAccountTest() {
    }

    @Before
    public void initTests() {
        this.savingsAccount = new SavingsAccount();
    }

    @Test
    public void deposit() {
        long expected = 123L;
        Assert.assertTrue(this.savingsAccount.deposit((double)expected));
        Assert.assertEquals(this.savingsAccount.getBalance(), (double)expected, 0.0D);
    }

    @Test
    public void withdrawWhenEnoughBalance() {
        this.setsInitialBalance(500.0D);
        Assert.assertTrue(this.savingsAccount.withdraw(100.0D));
        Assert.assertEquals(this.savingsAccount.getBalance(), 400.0D, 0.0D);
    }

    @Test
    public void withdrawWhenNotEnoughBalance() {
        int initialBalance = 99;
        this.setsInitialBalance((double)initialBalance);
        Assert.assertFalse(this.savingsAccount.withdraw(99.1D));
        Assert.assertEquals(this.savingsAccount.getBalance(), (double)initialBalance, 0.0D);
    }

    @Test
    public void withDrawFullBalance() {
        this.setsInitialBalance(99.0D);
        Assert.assertTrue(this.savingsAccount.withdraw(this.savingsAccount.getBalance()));
        Assert.assertEquals(this.savingsAccount.getBalance(), 0.0D, 0.0D);
    }

    private void setsInitialBalance(double amount) {
        this.savingsAccount.deposit(amount);
    }
}

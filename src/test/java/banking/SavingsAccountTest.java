
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
        float expected = 123.22f;
        Assert.assertTrue(this.savingsAccount.deposit(expected));
        Assert.assertEquals(this.savingsAccount.getBalance(), expected, 0.0f);
    }

    @Test
    public void withdrawWhenEnoughBalance() {
        this.setsInitialBalance(500.0f);
        Assert.assertTrue(this.savingsAccount.withdraw(100.0f));
        Assert.assertEquals(this.savingsAccount.getBalance(), 400.0f, 0.0f);
    }

    @Test
    public void withdrawWhenNotEnoughBalance() {
        float initialBalance = 99f;
        this.setsInitialBalance(initialBalance);
        Assert.assertFalse(this.savingsAccount.withdraw(99.1f));
        Assert.assertEquals(this.savingsAccount.getBalance(), (double)initialBalance, 0.0f);
    }

    @Test
    public void withDrawFullBalance() {
        this.setsInitialBalance(99.0f);
        Assert.assertTrue(this.savingsAccount.withdraw(this.savingsAccount.getBalance()));
        Assert.assertEquals(this.savingsAccount.getBalance(), 0.0D, 0.0D);
    }

    private void setsInitialBalance(float amount) {
        this.savingsAccount.deposit(amount);
    }
}

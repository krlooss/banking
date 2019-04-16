package banking;

import java.util.UUID;

import banking.Bank;
import banking.Customer;
import org.junit.Before;
import org.junit.Test;

public class BankTest {
    public BankTest() {
    }

    @Before
    public void setUp() throws Exception {
        new Bank();
    }

    @Test
    public void createCustomer() {
        new Customer(UUID.randomUUID());
    }

    @Test
    public void createCustomerWhenAlreadyExists() {
    }

    @Test
    public void findCustomer() {
    }
}

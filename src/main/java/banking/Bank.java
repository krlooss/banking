
package banking;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class Bank {
    private Map<UUID, Customer> customers;

    public Bank() {
    }

    public Optional<Customer> findCustomer(UUID customerId) {
        return Optional.ofNullable(this.customers.get(customerId));
    }

    public void createCustomer(Customer customer) throws CustomerAlreadyExistsException {
        if (this.customerExists(customer)) {
            throw new CustomerAlreadyExistsException("Error creating customer, customer: " + customer.getId().toString() + " already exist");
        } else {
            this.customers.put(customer.getId(), customer);
        }
    }

    private boolean customerExists(Customer customer) {
        return this.customers.get(customer.getId()) != null;
    }
}

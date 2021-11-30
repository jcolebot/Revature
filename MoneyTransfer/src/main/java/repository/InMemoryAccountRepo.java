package repository;
import account.Account;
import java.util.Optional;

public class InMemoryAccountRepo implements AccountRepository {

    public InMemoryAccountRepo() {
        System.out.println("InMemoryAccountRepo instance created.");
    }
    @Override
    public Optional<Account> loadAccount(String accountNumber) {
        // find by account number
        System.out.println("Loading account... " + accountNumber);
        Account account = new Account(accountNumber, 1000.00);
        return Optional.of(account);
    }
    @Override
    public void updateAccount(Account account) {
        // Updates account
        System.out.println("Updating account... " + account.getNumber());
        System.out.println("Current balance: " + account.getBalance());
    }
}

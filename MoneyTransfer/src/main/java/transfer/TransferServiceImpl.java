package transfer;

import account.Account;
import exceptions.AccountNotFoundException;
import exceptions.BalanceException;
import repository.AccountRepository;
import org.apache.log4j.Logger;


public class TransferServiceImpl implements TransferService {

    private static final Logger logger = Logger.getLogger("mts");

    // Abstraction
    private AccountRepository accountRepository;

    // Constructor
    public TransferServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public  boolean transfer(double amount, String fromAccountNumber, String toAccountNumber) {
        logger.info("Transfer initiated...");

        // Load FROM account
        Account fromAccount = accountRepository.loadAccount(fromAccountNumber).orElseThrow(
                () -> new AccountNotFoundException(fromAccountNumber)
        );

        // Load TO account
        Account toAccount = accountRepository.loadAccount(toAccountNumber).orElseThrow(
                () -> new AccountNotFoundException(toAccountNumber)
        );

        // Check FROM account has enough funds
        if (fromAccount.getBalance() < amount) {
            throw new BalanceException(fromAccount.getBalance());
        }

        // Debit FROM account
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        logger.debug("debited");

        // Credit TO account
        toAccount.setBalance(toAccount.getBalance() + amount);
        logger.debug("credited");

        // Update both accounts
        accountRepository.updateAccount(fromAccount);
        accountRepository.updateAccount(toAccount);
        logger.info("Transfer completed.");

        return true;
    }
}

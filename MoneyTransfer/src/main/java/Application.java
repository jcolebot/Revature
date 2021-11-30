
import exceptions.BalanceException;
import exceptions.AccountNotFoundException;
import repository.AccountRepository;
import repository.JdbcAccountRepository;
import transfer.TransferService;
import transfer.TransferServiceImpl;
import org.apache.log4j.Logger;



public class Application {
    // Singleton class so only one instance is created
    private static final Logger logger = Logger.getLogger("mts");

    public static void main(String[] args) {
        logger.info("application - started");

        AccountRepository accountRepository = new JdbcAccountRepository();
        TransferService transferService = new TransferServiceImpl(accountRepository);

        try {
            transferService.transfer(300, "1", "2");
        } catch (AccountNotFoundException e) {
            logger.error("Account not found - " + e.getMessage());
        } catch (BalanceException e) {
            logger.error("Not enough funds. Current balance = " + e.getMessage());
        }
        logger.info("application - ended");
    }
}

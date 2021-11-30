package transfer;

public interface TransferService {
    boolean transfer(double amount, String fromAccountNumber, String toAccountNumber);
}
